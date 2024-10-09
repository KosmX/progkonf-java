package dev.kosmx.darkjava.finalize;

public class Util {
    public static void gc() {
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignore) {}
    }
}
