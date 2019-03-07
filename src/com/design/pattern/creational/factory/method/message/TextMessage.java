package com.design.pattern.creational.factory.method.message;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }

}
