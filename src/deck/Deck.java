package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    
    // List
    // Set
    private List<Card> cards;

    private final String[] SUITS = {"Diamond", "Club", "Heart", "Spade"};

    private final String[] NAMES = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    private final int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    public Deck() {
        
        // Instantiate an empty array list for deck
        cards = new ArrayList<>();

        for (int s = 0; s < SUITS.length ; s++) {
            String suit = SUITS[s];

            for (int n = 0; n < NAMES.length; n++) {
                String name = NAMES[n];
                int value = VALUES[n];

                // Add card into deck
                cards.add(new Card(suit, name, value));
            }
        }
    }

    @Override
    public String toString() {
        return "Number of cards: " + cards.size();
    }

    public void printFirstFiveCards() {
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }

    public void draw() {
        Random rand = new Random();
        int drawIndex = rand.nextInt(52);
        System.out.printf("Drawn: %s \n", cards.get(drawIndex));
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
