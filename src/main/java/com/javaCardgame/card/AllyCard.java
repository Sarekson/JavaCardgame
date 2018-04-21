package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Ally card template for Quest of the Round Table
 */
public class AllyCard extends AdventureCard{
	/**
	 * Makes a card with only battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public AllyCard(String type,String name,String image,int stats1) {
		super(type,name,image,stats1);
		
		setForTable(true);//effects where it can be played
	}
	/**
	 * Makes a card with bid value as the main stat
	 * @param type
	 * @param name
	 * @param image
	 * @param isBid
	 * @param stats1
	 */
	public AllyCard(String type,String name,String image,boolean isBid,int stats1) {
		super(type,name,image,isBid,stats1);
		
		setForTable(true);//effects where it can be played	
	}
	/**
	 * Makes a card with both isAlsoBp bid value and battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param isBid
	 * @param isAlsoBp
	 * @param stats1
	 * @param stats2
	 */
	public AllyCard(String type,String name,String image,boolean isBid,boolean isAlsoBp,int stats1,int stats2) {
		super(type,name,image,isBid,isAlsoBp,stats1,stats2);
		
		setForTable(true);//effects where it can be played
	}
	/**
	 * Makes a card that only has an effect
	 * @param effectIndex 
	 * @param type
	 * @param name
	 * @param image
	 */
	public AllyCard(int effectIndex,String type,String name,String image) {
		super(effectIndex,type,name,image);
		
		setForTable(true);//effects where it can be played
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
	public AllyCard(int effectIndex,String type,String name,String image,int stats1,int stats2) {
		super(effectIndex,type,name,image,stats1,stats2);
		
		setForTable(true);//effects where it can be played
	}
	/**
	 * Makes a card with battle value and conditional bid value 
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param isbid
	 * @param stats1
	 * @param stats2
	 */
	public AllyCard(int effectIndex,String type,String name,String image,boolean isBid,int stats1,int stats2) {
		super(effectIndex,type,name,image,isBid,stats1,stats2);
		
		setForTable(true);//effects where it can be played
	}
	/**
	 * Makes a card with battle value and conditional bid value
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param isBid
	 * @param isAlsoBp
	 * @param stats1
	 * @param stats2
	 */
	public AllyCard(int effectIndex,String type,String name,String image,boolean isBid,boolean isAlsoBp,int stats1,int stats2) {
		super(effectIndex,type,name,image,isBid,isAlsoBp,stats1,stats2);
		
		setForTable(true);//effects where it can be played
	}
}