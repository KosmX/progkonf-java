package dev.kosmx.darkjava.reflection;

import java.util.ArrayList;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(128);
        for (int i = 0; i < 1024; i++) {
            people.add(new Person());
        }

        var startSort = System.nanoTime();

        people.sort((a, b) -> {
            return Integer.compare(a.a, b.a);
        });

        var endSort = System.nanoTime();
        System.out.printf("Sorting took %d us%n", (endSort - startSort)/1000); // 3 ms

        System.out.printf(String.valueOf(people));
    }
}
