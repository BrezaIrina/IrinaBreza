package com.irinabreza.hillel.Homework6;

public class Card {

    String rank;
    String suit;
    static String[] allRanks = {"Hearts", "Clubs", "Diamonds", "Spades"};
    static String[] allSuits = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static Card queenOfHearts = new Card("Queen", "Heart");

    Card(String rank, String suite) {
        this.rank = rank;
        this.suit = suite;
    }

    public String getDescription() {
        String cardDescription = suit + " of " + rank;
        return cardDescription;
    }
}
