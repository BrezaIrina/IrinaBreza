package com.irinabreza.hillel.Homework6;

public class PokerGame {
    public static void main(String[] args) {

        Player ivan = new Player("Ivan");
        Player anton = new Player("Anton");
        Player tom = new Player("Tom");
        Player pit = new Player("Pit");
        Player[] players = {ivan, anton, tom, pit};

        tryToPlayGame(players);
        System.out.println("Game ends");
    }

    private static void tryToPlayGame(Player[] players) {
        try {
            Deck shuffledDeck = new Deck(Card.emptyArray, Card.allSuits);
            System.out.println("Game starts");
            for (int index = 0; index < 15; index++) {
                System.out.println("");
                System.out.println("New round");
                for (Player currentPlayer : players) {
                    drawRandomCard(shuffledDeck, currentPlayer);
                }
            }
        } catch (PokerGameException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void drawRandomCard(Deck shuffledDeck, Player currentPlayer) throws PokerGameException {
        Card currentCard = shuffledDeck.getRandomCard();
        String currentCardDescription = currentCard.getDescription();
        System.out.printf("Player %s receives %s", currentPlayer.name, currentCardDescription);
        System.out.println("");
    }
}
