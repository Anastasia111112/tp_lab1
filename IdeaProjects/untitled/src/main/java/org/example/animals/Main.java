package org.example.animals;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Tiger;
import org.example.animals.Hare;
import org.example.animals.Moose;
import org.example.animals.Beaver;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Cat("Barsik", 5, 200),
                new Dog("Bobik", 3, 500, 10),
                new Tiger("Businka", 8, 150, 50),
                new Hare("Richard", 6, 100, 50),
                new Moose("Murzik", 4, 800, 20),
                new Beaver("Boris", 9, 300, 30)

        };
        for (Animal animal : animals) {
            animal.run(100);
            animal.swim(5);
        }
        new Cat("Barsik", 5, 200);
        new Tiger("Businka", 8, 150, 50);
        ((Region)animals[3]).Dangerous();
        ((Region)animals[4]).Dangerous();
        ((Region)animals[5]).Dangerous();
        System.out.println("Количество котов:" + Cat.getCount());
        System.out.println("Количество собак :" + Dog.getCount());
        System.out.println("Количество тигров: " + Tiger.getCount());
        System.out.println("Количество региональных животных: " + Region.getCount());
        System.out.println("Количество животных: " + Animal.getCount());
    }

}