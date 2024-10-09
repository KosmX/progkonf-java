package dev.kosmx.darkjava.closeables;

import dev.kosmx.darkjava.finalize.Util;

public class Auto implements AutoCloseable {
    public final int id;

    public Auto(int id) {
        this.id = id;
    }

    @Override
    public void close() {
        System.out.println("Closing " + id);
    }


    public static void main(String[] args) {
        Auto[] closeables = new Auto[128];
        for(int i = 0; i < 128; i++) {
            closeables[i] = new Auto(i * 7);
        }


        // don't forget to close them!
        for(int i = 0; i < 128; i++) {
            closeables[i].close();
            closeables[i] = null;
        }
        Util.gc();
        closeables = null;
    }
}
