package com.javaCardgame.deck;
import java.util.*;

import com.javaCardgame.card.Card;
import com.javaCardgame.card.RankCard;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 16 2018
 * Private project done to increase understanding of Java FX
 * Adventure card deck for Quest of the Round Table
 */
//rank cards not on table 1 deck per person
public class RankDeck extends Deck{
	private static final String[] NAMES = {
		"Squire",
		"Knight",
		"ChampionKnight"
	};
	/**
	 * Makes an empty ArrayList<Card> to fit all rank cards
 	 */
	public RankDeck() {
		super(new ArrayList<Card>(28));
	
		CardStorage[] allRankCards = createAllRankCards();			
		ArrayList<Card> rankDeck   = new ArrayList<Card>(3);
				
		initDeck(rankDeck,allRankCards);
		setDeck(rankDeck);
	}
	/**
	 * Forms an array of rank Cards
	 * @return allRankCards
	 */
	public CardStorage[] createAllRankCards() {
		CardStorage[] allRankCards = {
			new CardStorage(1,new RankCard("Rank","","",5)),
			new CardStorage(1,new RankCard("Rank","","",10)),
			new CardStorage(1,new RankCard("Rank","","",20)),
		};
		initCardStorage(allRankCards,NAMES);
		return allRankCards;
	}
}
