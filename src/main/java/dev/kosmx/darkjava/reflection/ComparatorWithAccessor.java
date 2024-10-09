package dev.kosmx.darkjava.reflection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

public class ComparatorWithAccessor {
    static class AccessorA implements Function<Person, Integer> {

        @Override
        public Integer apply(Person person) {
            return person.a;
        }
    }

    static class AccessorB implements Function<Person, Integer> {

        @Override
        public Integer apply(Person person) {
            return person.b;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>(128);
        for (int i = 0; i < 1024; i++) {
            people.add(new Person());
        }

        System.out.println("Mi szerint rendezzem?");
        var name = scanner.nextLine();

        var createTime = System.nanoTime();
        var getter = name.equals("a") ? new AccessorA() : new AccessorB();

        var startSort = System.nanoTime();

        people.sort(Comparator.comparingInt(getter::apply));

        var endSort = System.nanoTime();
        System.out.printf("Creating reflector took %d us%n", (startSort - createTime)/1000);
        System.out.printf("Sorting took %d us%n", (endSort - startSort)/1000); // 3.7ms

        System.out.printf(String.valueOf(people));
    }

}
