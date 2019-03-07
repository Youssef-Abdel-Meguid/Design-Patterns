package com.design.pattern.creational.factory.method;

import com.design.pattern.creational.factory.method.message.Message;
import com.design.pattern.creational.factory.method.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }

}
