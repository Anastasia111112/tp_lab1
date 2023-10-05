package org.example.animals;

public class Hare extends Region {
    private static int count;
    private static String getDangerDescription = "Чуя опасность, он убегает";

    public Hare(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, age,Danger, maxRunDistance, maxSwimDistance, getDangerDescription);
        count++;
    }
    private static boolean Danger = false;
    }