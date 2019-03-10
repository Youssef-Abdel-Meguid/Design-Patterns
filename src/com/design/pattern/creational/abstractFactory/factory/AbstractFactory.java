package com.design.pattern.creational.abstractFactory.factory;

public interface AbstractFactory<T> {

    public T create(String type);

}
