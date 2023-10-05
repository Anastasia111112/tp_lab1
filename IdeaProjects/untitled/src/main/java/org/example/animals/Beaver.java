package org.example.animals;

public class Beaver extends Region {
    private static int count;
    private static String getDangerDescription = "Если почувствуют угрозу, могут атаковать людей";

    public Beaver(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, age,Danger, maxRunDistance, maxSwimDistance, getDangerDescription);
        count++;
    }
    private static boolean Danger = false;
    }