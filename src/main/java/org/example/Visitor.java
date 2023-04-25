package org.example;

public interface Visitor {
    public void visitSetUsernameMessage(SetUsernameMessage setUsernameMessage);
    public void visitSetNumberOfPlayersMessage(SetNumberOfPlayersMessage setNumberOfPlayersMessage);

}
