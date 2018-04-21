package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Tournament card template for Quest of the Round Table
 */
public class TournamentCard extends StoryCard{
	/**
	 * Makes a card with an effect and one stat value
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public TournamentCard(int e,String t,String n,String i,int s){
		super(e,t,n,i,s);
		
		setIsShield(true);
		setIsTornamnet(true);//used in controller
	}
}
