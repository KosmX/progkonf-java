package dev.kosmx.darkjava.reflection;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorWithUnreflect {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var scanner = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>(128);
        for (int i = 0; i < 1024; i++) {
            people.add(new Person());
        }

        System.out.println("Mi szerint rendezzem?");
        var name = scanner.nextLine();

        var createTime = System.nanoTime();

        var field = Person.class.getField(name);
        var getter = MethodHandles.lookup().unreflectGetter(field);

        var startSort = System.nanoTime();

        people.sort(Comparator.comparingInt(a -> {
            try {
                return (int) getter.invokeExact(a);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }));

        var endSort = System.nanoTime();
        System.out.printf("Creating reflector took %d us%n", (startSort - createTime)/1000);
        System.out.printf("Sorting took %d us%n", (endSort - startSort)/1000); // 5ms

        System.out.printf(String.valueOf(people));
    }

}
