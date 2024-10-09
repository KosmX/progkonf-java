package dev.kosmx.darkjava.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        Person me = new PersonPresenting();

        System.out.println(me.whatClothesAreOnMe());


        System.out.println(Arrays.stream(me.getClass().getMethods()).map(Method::getName).toList());
    }
}
