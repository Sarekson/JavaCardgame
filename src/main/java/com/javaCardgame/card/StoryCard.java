package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Story card template for Quest of the Round Table
 */
public class StoryCard extends Card{
	private static int effectIndex;
	private static int stats1;
	private static int stats2;
	
	private static boolean longlasting = false;
	private static boolean isShield    = false;
	private static boolean isDraw      = false;
	private static boolean isAlly      = false;
	private static boolean isTornamnet = false;//effects logic in controller
	private static boolean isQuest     = false;//effects logic in controller
	private static boolean isEvent     = false;//effects logic in controller
	/**
	 * Makes a card with only one stat
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public StoryCard(String type,String name,String image,int stats1){
		super(type,name,image);
		
		setStats1(stats1);
	}
	/**
	 * Makes a card that only has an effect
	 * @param effectIndex 
	 * @param type
	 * @param name
	 * @param image
	 */
	public StoryCard(int effectIndex,String type,String name,String image){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
	}
	/**
	 * Makes a card with an effect and one stat value
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public StoryCard(int effectIndex,String type,String name,String image,int stats1){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setStats1(stats1);
	}
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
	public StoryCard(int effectIndex,String type,String name,String image,int stats1,boolean isShield,boolean isDraw,boolean isAlly){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setStats1(stats1);
	    setIsShield(isShield);
		setIsDraw(isDraw);
		setIsAlly(isAlly);
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
	public StoryCard(int effectIndex,String type,String name,String image,int stats1,int stats2,boolean isShield,boolean isDraw,boolean isAlly){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setStats1(stats1);
		setStats2(stats2);
		setIsShield(isShield);
		setIsDraw(isDraw);
	    setIsAlly(isAlly);
	}
	/**
	 * @return stats1
	 */
	public static int getStats1() {
		return stats1;
	}
	/**
	 * @param stats1
	 */
	public static void setStats1(int stats1) {
		StoryCard.stats1 = stats1;
	}
	/**
	 * @return longlasting
	 */
	public static boolean getLonglasting() {
		return longlasting;
	}
	/**
	 * @param longlasting
	 */
	public static void setLonglasting(boolean longlasting) {
		StoryCard.longlasting = longlasting;
	}
	/**
	 * @return isTornamnet
	 */
	public static boolean getIsTornamnet() {
		return isTornamnet;
	}
	/**
	 * @param isTornamnet
	 */
	public static void setIsTornamnet(boolean isTornamnet) {
		StoryCard.isTornamnet = isTornamnet;
	}
	/**
	 * @return isQuest
	 */
	public static boolean getIsQuest() {
		return isQuest;
	}
	/**
	 * @param isQuest
	 */
	public static void setIsQuest(boolean isQuest) {
		StoryCard.isQuest = isQuest;
	}
	/**
	 * @return isEvent
	 */
	public static boolean getIsEvent() {
		return isEvent;
	}
	/**
	 * @param isEvent
	 */
	public static void setIsEvent(boolean isEvent) {
		StoryCard.isEvent = isEvent;
	}
	/**
	 * @return isShield
	 */
	public static boolean getIsShield() {
		return isShield;
	}
	/**
	 * @param isShield
	 */
	public static void setIsShield(boolean isShield) {
		StoryCard.isShield = isShield;
	}
	/**
	 * @return isDraw
	 */
	public static boolean getIsDraw() {
		return isDraw;
	}
	/**
	 * @param isDraw
	 */
	public static void setIsDraw(boolean isDraw) {
		StoryCard.isDraw = isDraw;
	}
	/**
	 * @return isAlly
	 */
	public static boolean getIsAlly() {
		return isAlly;
	}
	/**
	 * @param isAlly
	 */
	public static void setIsAlly(boolean isAlly) {
		StoryCard.isAlly = isAlly;
	}
	/**
	 * @return stats2
	 */
	public static int getStats2() {
		return stats2;
	}
	/**
	 * @param stats2
	 */
	public static void setStats2(int stats2) {
		StoryCard.stats2 = stats2;
	}
	/**
	 * @return effectIndex
	 */
	public static int getEffectIndex() {
		return effectIndex;
	}
	/**
	 * @param effectIndex
	 */
	public static void setEffectIndex(int effectIndex) {
		StoryCard.effectIndex = effectIndex;
	}
}
