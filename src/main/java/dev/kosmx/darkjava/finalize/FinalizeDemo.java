package dev.kosmx.darkjava.finalize;


public class FinalizeDemo {
    static int resourceCounter;

    public static class CloseableObject{
        final int id;

        public CloseableObject() {
            id = resourceCounter++;
            System.out.printf("Creating closeable object ID: %d\n", id);
        }

        @Override
        protected void finalize() {
            System.out.printf("Closing %d and freeing a resource slot%n", id);
            resourceCounter--;
        }
    }



    public static void main(String[] args) {
        // example object
        CloseableObject a = new CloseableObject();
        Util.gc(); // it will do nothing here
        System.out.println("deleting a");
        a = null;

        Util.gc();


        /*
        CloseableObject[] objects = new CloseableObject[100];
        for (int i = 0; i < 100; i++) {
            objects[i] = new CloseableObject();
        }

        System.out.println("freeing a bunch of objects");
        objects = null;
        // */
    }
}
