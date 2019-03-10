package com.design.pattern.creational.abstractFactory;

import com.design.pattern.creational.abstractFactory.factory.AbstractFactory;
import com.design.pattern.creational.abstractFactory.factory.AnimalFactory;
import com.design.pattern.creational.abstractFactory.factory.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String family) {

        if("Animal".equalsIgnoreCase(family))
            return new AnimalFactory();

        if("Color".equalsIgnoreCase(family))
            return new ColorFactory();

        return null;

    }

}
