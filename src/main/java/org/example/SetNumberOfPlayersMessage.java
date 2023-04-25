package org.example;

public class SetNumberOfPlayersMessage extends Message {
    private int numOfPlayers;
    SetNumberOfPlayersMessage(int messageNumber, int numOfPlayers) {
        super(messageNumber);
        this.numOfPlayers = numOfPlayers;
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitSetNumberOfPlayersMessage(this);
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }
}
