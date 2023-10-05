package org.example.animals;

public class Dog extends Animal{
    public static int count;

    public Dog(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, age, maxRunDistance, maxSwimDistance);
        count ++;
    }

    public static int getCount() {
        return count;
    }
}

