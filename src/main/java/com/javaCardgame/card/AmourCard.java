package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Amour card template for Quest of the Round Table
 */
public class AmourCard extends AdventureCard{
	/**
	 * Makes a card with both a bid value and battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param isBid
	 * @param isAlsoBp
	 * @param stats1
	 * @param stats2
	 */
	public AmourCard(String type,String name,String image,boolean isBid,boolean isAlsoBp,int stats1,int stats2) {
		super(type,name,image,isBid,isAlsoBp,stats1,stats2);
		
		setForTable(true); //effects where it can be played
		setLengthInPlay(2);//indicates every stage of quest or 1 tournament
	}
}
