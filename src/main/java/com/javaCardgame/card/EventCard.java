package com.javaCardgame.card;

import com.javaCardgame.card.StoryCard;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Event card template for Quest of the Round Table
 */
public class EventCard extends StoryCard{
	/**
	 * Makes a card with a card draw/discard effect
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 * @param isShield
	 * @param isDraw
	 * @param isAlly
	 */
	public EventCard(int effectIndex,String type,String name,String image,int stats1,boolean isShield,boolean isDraw,boolean isAlly){
		super(effectIndex,type,name,image,stats1,isShield,isDraw,isAlly);
		
		setIsEvent(true);//used in controller
		
		if (name.equals("King'stats1 Recognition")) {
			setLonglasting(true);//used in controller makes last till end of next quest
		}
	}
	/**
	 * Makes a card with a 2 options for a card draw/discard effect
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 * @param stats2
	 * @param isShield
	 * @param isDraw
	 * @param isAlly
	 */
	public EventCard(int effectIndex,String type,String name,String image,int stats1,int stats2,boolean isShield,boolean isDraw,boolean isAlly){
		super(effectIndex,type,name,image,stats1,stats2,isShield,isDraw,isAlly);
		
		setIsEvent(true);//used in controller
	}
}