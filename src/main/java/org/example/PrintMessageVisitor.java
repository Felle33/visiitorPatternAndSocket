package org.example;

public class PrintMessageVisitor implements Visitor {
    @Override
    public void visitSetUsernameMessage(SetUsernameMessage setUsernameMessage) {
        System.out.println("Questo è un messaggio di setUsername");
        System.out.println("Lo username è: " + setUsernameMessage.getUsername());
    }

    @Override
    public void visitSetNumberOfPlayersMessage(SetNumberOfPlayersMessage setNumberOfPlayersMessage) {
        System.out.println("Questo è un messaggio di setNumero di giocatori");
        System.out.println("Numero di giocatori: " + setNumberOfPlayersMessage.getNumOfPlayers());
    }
}
