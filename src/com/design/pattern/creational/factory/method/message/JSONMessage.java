package com.design.pattern.creational.factory.method.message;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "JSON:[]";
    }

}
