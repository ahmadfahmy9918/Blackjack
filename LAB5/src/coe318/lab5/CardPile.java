package coe318.lab5;
/**
 *
 * @author 
 */

import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

/**
 * A pile of cards.
 *
 */
public class CardPile {
    //Instance variables
    private ArrayList<Card> cards;
   //int currentPileNum;

    public CardPile() {
        //Initialize the instance variable.
    	//currentPileNum = 0;
    	cards = new ArrayList<Card>();
    	
    }
    /**
     * Add a card to the pile.
     * @param card
     */
    public void add(Card card) {
    	cards.add(card);
    }

    /**
     * Remove a card chosen at random from the pile.
     * @return
     * 
     */
    public Card removeRandom() {
    	/*int randomNum = (int)Math.round((Math.random()*((cards.size()-2)+1))+2);
        return	cards.remove(randomNum); //FIX THIS*/
    	
    	Random cardDeal = new Random();
    	
    	if(cards.size() != 0)
    		return cards.remove(cardDeal.nextInt(cards.size()));
    	
    	else
    		return cards.remove(cards.size());
    }

    /**
     * 
     * The string representation is a space separated list
     * of each card.
     * @return
     */
    @Override
    public String toString() {
    	String totalCards = "";
    	
    		for(int i = 0; i < cards.size(); i++)
    	{
    			totalCards = totalCards + (cards.get(i) + "");
    	}
    	return totalCards;
    }
    
    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }


}