package com.javaCardgame.card;

import com.javaCardgame.card.StoryCard;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Quest card template for Quest of the Round Table
 */
public class QuestCard extends StoryCard{
	/**
	 * Makes a card with only one stat
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public QuestCard(String type,String name,String image,int stats1){
		super(type,name,image,stats1);
		
		setIsQuest(true);//used in controller
	}
}