package org.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SetUsernameMessage extends Message {
    private String username;

    public SetUsernameMessage(int messageNumber, String username) {
        super(messageNumber);
        this.username = username;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitSetUsernameMessage(this);
    }

    public String getUsername() {
        return username;
    }
}
