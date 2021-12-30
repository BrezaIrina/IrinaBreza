package com.irinabreza.hillel.Homework6;
import java.util.Random;

//1. contains 36 different cards
//2. delete cart from deck and repeat 5 times per 4 players

public class Deck {

    private Card[] shuffledDeck; ///54 cards
    private int indexOfCardToDraw = 0;

    Deck(String[] allRanks, String[] allSuits) throws PokerGameException {

        int cardsCount = allRanks.length * allSuits.length;
        Card[] unshuffledDeck = new Card[cardsCount];
        int currentIndex = 0;

        for (String suit : allSuits) {
            for (String rank : allRanks) {
                Card currentCard = new Card(rank, suit);
                unshuffledDeck[currentIndex] = currentCard;
                currentIndex++;
            }
        }
        this.shuffledDeck = unshuffledDeck;
        Deck.shuffleArray(shuffledDeck);
    }

    static void shuffleArray(Card[] array) throws PokerGameException {
        if (array.length == 0) {
            throw PokerGameException.deckEmpty;
        }
        Random random = new Random();
        for (int index = array.length - 1; index > 0; index--) {
            int newIndex = random.nextInt(index + 1);
            Card currentCard = array[newIndex];
            array[newIndex] = array[index];
            array[index] = currentCard;
        }
    }

    public Card getRandomCard() throws PokerGameException {
        if (indexOfCardToDraw < shuffledDeck.length) {
            Card requiredCard = shuffledDeck[indexOfCardToDraw];
            indexOfCardToDraw ++;
            return requiredCard;
        } else {
            throw PokerGameException.allCardsAreDrawn;
        }
    }
}
