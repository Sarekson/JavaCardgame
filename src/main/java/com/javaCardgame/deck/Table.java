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
//shields and 1 rank
//shields not acquired and acquired are both suppose to be visible
public class Table extends Deck{
	static Card rank;
	/**
	 * Makes the empty table view
	 */
	public Table() {
		super(new ArrayList<Card>(11));
		//rank = squire TODO
	}
	/**
	 * @return rank
	 */
	public Card getRank() {
		return rank;
	}
	/**
	 * @param rank
	 */
	public void setRank(Card rank) {
		Table.rank = rank;
	}
}