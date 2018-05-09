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

        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for (Suit suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }

        Collections.shuffle(cards, new Random());
    }

    public synchronized static SingletonDeck getInstance(){
        if(instance == null){
            instance = new SingletonDeck();
        }
        return instance;
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }
}




