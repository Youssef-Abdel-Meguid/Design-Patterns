package com.design.pattern.creational.abstractFactory.animal;

public class Dog implements Animal {

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
