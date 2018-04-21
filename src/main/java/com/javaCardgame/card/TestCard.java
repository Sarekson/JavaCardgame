package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Test card template for Quest of the Round Table
 */
public class TestCard extends AdventureCard{
	/**
	 * Makes a card with no excess information
	 * @param type
	 * @param name
	 * @param image
	 */
	public TestCard(String t,String n,String i) {
		super(t,n,i);
		
		setIsFaceDown(true);//effects where it can be played
		setLengthInPlay(1); //indicates 1 stage of quest or 1 tournament
	}
	/**
	 * Makes a card with minimum bid limit
	 * @param isBidMin
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public TestCard(boolean m,String t,String n,String i,int b1) {
		super(m,t,n,i,b1);
		
		setIsFaceDown(true);//effects where it can be played
		setLengthInPlay(1); //indicates 1 stage of quest or 1 tournament
	}
}