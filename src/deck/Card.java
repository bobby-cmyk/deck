package deck;

public class Card {
    
    // Card will have a suit, name, and value

    // Once a card is created, the information on a card cannot be changed

    private String suit;
    private String name;
    private int value;

    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return ("Card{Suit: %s, Name: %s, Value: %d}").formatted(this.suit, this.name, this.value);
    }

}
