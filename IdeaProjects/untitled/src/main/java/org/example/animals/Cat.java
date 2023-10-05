package org.example.animals;

public class Cat extends Animal{
    public static int count;
    public Cat (String name,int age, int maxRunDistance) {
        super(name, age, maxRunDistance,0);
        count ++;
    }

    public static int getCount() {
        return count;
    }
}
