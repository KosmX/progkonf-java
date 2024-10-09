package dev.kosmx.darkjava.closeables;

import dev.kosmx.darkjava.finalize.Util;

import java.lang.ref.Cleaner;

public class CleanerExample {
    // cleaner instance
    static Cleaner cleaner = Cleaner.create();

    public static class ObjectWithResource implements AutoCloseable {
        private final Resource res = new Resource();
        private final Cleaner.Cleanable job;


        public ObjectWithResource() {
            job = cleaner.register(this, res);
        }

        @Override
        public void close() {
            job.clean();
        }


        private static final class Resource implements Runnable {
            private static int openResources = 0;
            public Resource() {
                openResources++;
            }

            @Override
            public void run() {
                System.out.println("Closing resource");
                openResources--;
            }
        }
    }


    public static void main(String[] args) {

        ObjectWithResource o = new ObjectWithResource();

        o.close();

        System.out.println("Cleaning object");
        o = null;

        Util.gc();
        System.out.printf("\n\nThere are %d opened resource(s)%n", ObjectWithResource.Resource.openResources);
    }
}
