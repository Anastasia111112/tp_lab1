package org.example.animals;

public class Moose extends Region {
    private static int count;
    private boolean isDangerous;
    private static String getDangerDescription = "Опасность состоит в агрессивности и силе этого животного.";

    public Moose(String name, int age, int maxRunDistance, int maxSwimDistance) {
        super(name, age,true, maxRunDistance, maxSwimDistance, getDangerDescription);
        this.isDangerous = true;
        count++;
    }

    public void setDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public boolean isDangerous() {
        return isDangerous;
    }
}