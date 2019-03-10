package com.design.pattern.creational.abstractFactory.factory;

import com.design.pattern.creational.abstractFactory.color.Black;
import com.design.pattern.creational.abstractFactory.color.Brown;
import com.design.pattern.creational.abstractFactory.color.Color;
import com.design.pattern.creational.abstractFactory.color.White;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String type) {

        if("Black".equalsIgnoreCase(type))
            return new Black();

        if("Brown".equalsIgnoreCase(type))
            return new Brown();

        if("White".equalsIgnoreCase(type))
            return new White();

        return null;
    }
}
