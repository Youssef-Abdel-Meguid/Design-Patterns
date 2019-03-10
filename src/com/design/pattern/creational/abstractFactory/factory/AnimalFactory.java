package com.design.pattern.creational.abstractFactory.factory;

import com.design.pattern.creational.abstractFactory.animal.Animal;
import com.design.pattern.creational.abstractFactory.animal.Bear;
import com.design.pattern.creational.abstractFactory.animal.Dog;
import com.design.pattern.creational.abstractFactory.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String type) {

        if("Dog".equalsIgnoreCase(type))
            return new Dog();

        if("Duck".equalsIgnoreCase(type))
            return new Duck();

        if("Bear".equalsIgnoreCase(type))
            return new Bear();

        return null;
    }
}
