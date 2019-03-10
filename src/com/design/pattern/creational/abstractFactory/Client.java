package com.design.pattern.creational.abstractFactory;

import com.design.pattern.creational.abstractFactory.animal.Animal;
import com.design.pattern.creational.abstractFactory.color.Color;
import com.design.pattern.creational.abstractFactory.factory.AbstractFactory;

public class Client {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) abstractFactory.create("Dog");

        System.out.println("Animal's type: " + animal.getType());
        System.out.println("Animal's sound: " + animal.makeSound());

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("White");

        System.out.println("Animal's color: " + color.getColor());

    }

}
