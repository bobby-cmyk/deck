package deck;

public class Main{

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck);

        deck.printFirstFiveCards();

        deck.shuffle();

        System.out.println("Shuffled cards... \n");

        deck.printFirstFiveCards();

        deck.shuffle();

        System.out.println("Shuffled cards... \n");

        deck.printFirstFiveCards();

        deck.draw();

        deck.draw();

        deck.draw();
    }
}