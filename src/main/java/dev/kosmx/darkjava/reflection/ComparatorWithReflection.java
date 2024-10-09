package dev.kosmx.darkjava.reflection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorWithReflection {

    public static void main(String[] args) throws NoSuchFieldException {
        var scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>(128);
        for (int i = 0; i < 1024; i++) {
            people.add(new Person());
        }

        System.out.println("Mi szerint rendezzem?");
        var name = scanner.nextLine();

        var createTime = System.nanoTime();
        var field = Person.class.getField(name);

        var startSort = System.nanoTime();

        people.sort(Comparator.comparingInt(a -> {
            try {
                return (int) field.get(a);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }));

        var endSort = System.nanoTime();
        System.out.printf("Creating reflector took %d us%n", (startSort - createTime)/1000);
        System.out.printf("Sorting took %d us%n", (endSort - startSort)/1000); // 12 ms

        System.out.printf(String.valueOf(people));
    }

}
