package com.javaCardgame.deck;
import com.javaCardgame.card.Card;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 15 2018
 * Private project done to increase understanding of Java FX
 * Adventure card deck for Quest of the Round Table
 */
public class CardStorage {
	public int numberOf;
	public Card card;
	/**
	 * Makes a base class to store cards into decks
	 * @param numberOf 
	 * @param card
	 */
	public CardStorage(int numberOf,Card card) {
		this.numberOf = numberOf;
		this.card     = card;
	}
	/**
	 * @return card
	 */
	public Card getCard() {
		return card;
	}
	/**
	 * @param card
	 */
	public void setCard(Card card) {
		this.card = card;	
	}
	/**
	 * @return numberOf
	 */
	public int getNumberOf() {
		return numberOf;
	}
	/**
	 * @param numberOf
	 */
	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;	
	}
}