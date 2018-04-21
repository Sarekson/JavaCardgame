package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Foe card template for Quest of the Round Table
 */
public class FoeCard extends AdventureCard{
	/**
	 * Makes a card with only battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public FoeCard(String type,String name,String image,int stats1) {
		super(type,name,image,stats1);
		
		setIsFaceDown(true);//effects where it can be played
		setLengthInPlay(1); //indicates 1 stage of quest or 1 tournament
	}
	/**
	 * Makes a card with battle value and non-stat effect
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public FoeCard(int effectIndex,String type,String name,String image,int stats1) {
		super(effectIndex,type,name,image,stats1);
		
		setIsFaceDown(true);//effects where it can be played
		setLengthInPlay(1); //indicates 1 stage of quest or 1 tournament
	}
	/**
	 * Makes a card with battle value and conditional bonus battle value
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 * @param stats2
	 */
	public FoeCard(int effectIndex,String type,String name,String image,int stats1,int stats2) {
		super(effectIndex,type,name,image,stats1,stats2);
		
		setIsFaceDown(true);//effects where it can be played
		setLengthInPlay(1); //indicates 1 stage of quest or 1 tournament
	}
}