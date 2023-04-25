package org.example;

import java.io.Serializable;

public abstract class Message implements Serializable {
    private int messageNumber;

    Message(int messageNumber) {
        this.messageNumber = messageNumber;
    }

    public abstract void visit(Visitor visitor);
}
