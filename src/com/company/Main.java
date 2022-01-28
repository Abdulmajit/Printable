package com.company;

import interfaces.Animal;
import interfaces.Info;
import interfaces.Person;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(432);
        Person person = new Person("Soke");
        outputInto(animal);
        outputInto(person);
    }
        public static void outputInto(Info info){
            info.showInfo();
        }

}
