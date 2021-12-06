package com.irinabreza.hillel.Homework6;

public class PokerGameException extends RuntimeException {
    PokerGameException(String message) {
        super(message);
    }

    static PokerGameException deckEmpty = new PokerGameException("Deck is empty");
    static PokerGameException allCardsAreDrawn = new PokerGameException("All cards are drawn from the deck");
}
