package com.javaCardgame.deck;
import java.util.ArrayList;

import com.javaCardgame.card.Card;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 15 2018
 * Private project done to increase understanding of Java FX
 * Adventure card deck for Quest of the Round Table
 */
//only adventureCards 8 in play
//subclass for on table and for in quest
public class Hand extends Deck{
	/**
	 * Makes an empty hand to fit 20 adventure cards
	 */
	public Hand() {
		super(new ArrayList<Card>(20));
	}
}