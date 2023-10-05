package org.example.animals;

public class Animal {
    private static String Description;
    private String name;
    private int age;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int count;


    public Animal(String name, int age, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int dist) {
        if (maxRunDistance < dist) {
            System.out.println(this.name + " не смог пробежать " + dist);
        } else {
            System.out.println(this.name + " пробежал " + dist);
        }
    }

    public void swim(int swimDist) {
        if (maxSwimDistance == 0) {
            System.out.println(this.name + " не умеет плавать ");
        } else if (maxSwimDistance < swimDist) {
            System.out.println(this.name + " не смог проплыть " + swimDist);
        } else {
            System.out.println(this.name + " проплыл " + swimDist);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public static int getCount() {
        return count;
    }

}