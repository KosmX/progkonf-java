package dev.kosmx.darkjava.finalize;

import lombok.Data;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

public class Graveyard {
    static List<Person> zombiePopulation = new ArrayList<>();
    static Random random;

    static {
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            random = new Random();
        }
    }


    @Data
    public static final class Person {
        public final String name;
        private boolean isLiving = true;

        public Person(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() {
            System.out.println(name + " was garbage collected");
            if (isLiving) {
                zombiePopulation.add(this); // ⚡
                isLiving = false;
            }
        }
    }

    public static void main(String[] args) {
        List<Person> livingPopulation = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            livingPopulation.add(new Person("Person" + i));
        }

        livingPopulation.remove(random.nextInt(livingPopulation.size()));
        Util.gc();
        System.out.printf("There are %d zombies%n", zombiePopulation.size());

        Util.gc();
        System.out.printf(zombiePopulation.toString());
    }
}
