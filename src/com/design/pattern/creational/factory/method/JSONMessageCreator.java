package com.design.pattern.creational.factory.method;

import com.design.pattern.creational.factory.method.message.JSONMessage;
import com.design.pattern.creational.factory.method.message.Message;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }

}
