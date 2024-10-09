package dev.kosmx.darkjava.finalize;

import java.util.Random;

public class KillGC {
    volatile static FastCloseable s;

    public static class FastCloseable {
        public final String s;
        public static int closedCount = 0;
        public FastCloseable(String s) {
            this.s = s;
        }
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            closedCount++;
        }
    }

    static class BrokenCode {
        @Override
        protected void finalize() throws Throwable {
            Random r = new Random();
            while (true) {
                int i = r.nextInt(50);
                if (i > 100) break;
            }
        }
    }

    public static void main(String[] args) {

        Object o = new BrokenCode(); // drop it, GC will pick up
        //o = null; // see what does it do
        Util.gc();

        for (int i = 0; i < 10_000; i++) { // be careful when increasing 10_000 to higher amount, without GC, the JVM will run out of memory
            s = new FastCloseable(Integer.toString(i));
        }
        Util.gc();
        System.out.printf("Closed %d objects", FastCloseable.closedCount);
    }
}
