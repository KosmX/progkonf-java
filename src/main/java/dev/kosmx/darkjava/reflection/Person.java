package dev.kosmx.darkjava.reflection;

import java.lang.reflect.Field;
import java.util.Random;


public class Person {
    public int a = new Random().nextInt();
    public int b = new Random().nextInt();


    public final String whatClothesAreOnMe() throws IllegalAccessException {
        StringBuilder buffer = new StringBuilder();
        buffer.append("I have ");

        for (Field field : this.getClass().getFields()) {
            buffer.append(field.get(this));
            buffer.append(" and ");
        }
        buffer.delete(buffer.length() - 4, buffer.length());
        buffer.append("on me.");
        return buffer.toString();
    }


}
