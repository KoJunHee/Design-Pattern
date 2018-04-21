package ass6_2_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SingletonDeck {
    private List<Card> cards;

    private static SingletonDeck instance;

    private SingletonDeck(){
        cards = new ArrayList<Card>();
        // build the deck
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for (Suit suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }
        // shuffle it!
        Collections.shuffle(cards, new Random());
    }

    public static SingletonDeck getInstance(){
        if(instance == null){
            return new SingletonDeck();
        }else{
            return instance;
        }
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }
}
