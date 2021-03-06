package com.design.pattern.creational.abstractFactory.animal;

public class Bear implements Animal {

    @Override
    public String getType() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
