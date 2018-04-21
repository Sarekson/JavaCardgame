package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Rank card template for Quest of the Round Table
 */
public class RankCard extends Card{
	private static int battlePoints;
	/**
	 * Makes a card with only battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param battlePoints
	 */
	public RankCard(String type,String name,String image,int battlePoints) {
		super(type,name,image);
		
		setBattlePoints(battlePoints);
	}
	/**
	 * @return battlePoints
	 */
	public static int getBattlePoints() {
		return battlePoints;
	}
	/**
	 * @param battlePoints
	 */
	public static void setBattlePoints(int battlePoints) {
		RankCard.battlePoints = battlePoints;
	}
}