package org.example.animals;

public class Tiger extends Animal {
    public static int count;

    public Tiger(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, age, maxRunDistance, maxSwimDistance);
        count ++;
    }

    public static int getCount() {
        return count;
    }
}