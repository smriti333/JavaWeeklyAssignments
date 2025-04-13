package main;

import java.util.Random;
import java.util.Scanner;

class Card {
    private String suit;
    private String face;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " of " + suit;
    }
}

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};

        Card[] deck = new Card[52];
        int index = 0;

        // Create the deck
        for (String suit : suits) {
            for (String face : faces) {
                deck[index++] = new Card(face, suit);
            }
        }

        // Ask user how many cards they want
        System.out.print("How many cards would you like to deal (1–52)? ");
        int numCards = scanner.nextInt();

        if (numCards < 1 || numCards > 52) {
            System.out.println("Invalid number of cards. Please enter a number from 1 to 52.");
            return;
        }

        // Shuffle the deck
        shuffle(deck);

        // Deal the cards
        System.out.println("\nDealing " + numCards + " random card(s):\n");
        for (int i = 0; i < numCards; i++) {
            System.out.println(deck[i]);
        }

        scanner.close();
    }

    // Fisher–Yates shuffle
    private static void shuffle(Card[] deck) {
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}
