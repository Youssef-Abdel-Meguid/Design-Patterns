package com.design.pattern.creational.factory.method;

import com.design.pattern.creational.factory.method.message.Message;

public abstract class MessageCreator {

    public Message getMessage() {

        Message message = createMessage();
        message.addHeaders();
        message.encrypt();
        return message;
    }

    public abstract Message createMessage();

}
