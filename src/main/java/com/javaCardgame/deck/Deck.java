package com.javaCardgame.deck;
import java.util.*;

import com.javaCardgame.card.Card;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 15 2018
 * Private project done to increase understanding of Java FX
 * Adventure card deck for Quest of the Round Table
 */
//super deck class
//need to make RankPile - rest of rank cards not in table
//             Play - quest stages piles
public abstract class Deck {
	private static final String DIR       = "/src/main/resources/croppedCards/";
	private static final String FILE_TYPE = ".jpg";
	
	private static ArrayList<Card> deck;
	/**
	 * Makes a deck of cards equal to the param value
	 * @param deck
	 */
	public Deck(ArrayList<Card> deck) {
		Deck.deck = deck;
	}
	/**
	 * Gives the cards names and image file paths
	 * @param cardStore
	 * @param names
	 */
	public void initCardStorage(CardStorage[] cardStore,String[] names) {
		for (int i=0;i<cardStore.length;i++) {
			cardStore[i].getCard().name  = names[i];
			cardStore[i].getCard().image = DIR+names[i]+FILE_TYPE;
		}
	}
	/**
	 * Takes the cards from storage and puts them in the deck
	 * @param cardDeck
	 * @param cardStore
	 */
	public void initDeck(ArrayList<Card> cardDeck,CardStorage[] cardStore) {
		for (int i=0;i<cardStore.length;i++) {
			for (int j=0;j<cardStore[i].numberOf;j++) {
				Card tmp = cardStore[i].card;
				cardDeck.add(tmp);
			}
		}
	}
	/**
	 * @return deck
	 */
	public ArrayList<Card> getDeck() {
		return deck;
	}
	/**
	 * @param deck
	 */
	public static void setDeck(ArrayList<Card> deck) {
		Deck.deck = deck;
	}
}