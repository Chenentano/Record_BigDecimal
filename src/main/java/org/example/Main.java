package org.example;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Bastian", 27, "DaWoDuNichtWohnst");
        Owner owner2 = new Owner("Quynh", 29, "DaWoDuNichtWohnst");

        Species species1 = new Species("Cat",200);
        Species species2 = new Species("Dog",400);

        Animal animal1 = new Animal(1,"Rocky",species1, 7, owner1);
        Animal animal2 = new Animal(2,"Hayley",species1, 7, owner1);
        Animal animal3 = new Animal(3,"Lukas",species2, 10, owner2);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);


    }

}