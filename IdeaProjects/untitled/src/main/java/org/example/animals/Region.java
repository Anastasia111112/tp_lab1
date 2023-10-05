package org.example.animals;

public abstract class Region extends Animal {
    private boolean Danger;
    private String getDangerDescription;
    private static int count;
    public Region(String name, int age, boolean danger, int maxRunDistance, int maxSwimDistance,String getDangerDescription) {
        super(name, age, maxRunDistance, maxSwimDistance);
        Danger = danger;
        this.getDangerDescription = getDangerDescription;
        count++;
    }
    public void Dangerous(){
        if (Danger){
            System.out.println( this.getName() + " Опасное животное!" + this.getDangerDescription);
        }
        else System.out.println( this.getName()+ " Неопасное животное");
    }
    public static int getCount() {
        return count;
    }
}
