
package com.javaCardgame.card;

import com.javaCardgame.card.Card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Adventure card template for Quest of the Round Table
 */
public class AdventureCard extends Card{
	private static int effectIndex;
	
	private static int stats1;
	private static int stats2;
	
	private static boolean isBid      = false;
	private static boolean isBidMin   = false;
	private static boolean isAlsoBp   = false;
	private static boolean forTable   = false;
	private static boolean inPlay     = false;
	private static boolean inDiscard  = false;
	private static boolean isFaceDown = false;
	private static boolean isWeapon   = false;
	
	//0 means till effect removes,1 means until turn is over,2 means until quest is over
	private static int lengthInPlay   = 0;	
	/**
	 * Makes a card with no excess information
	 * @param type
	 * @param name
	 * @param image
	 */
	public AdventureCard(String type,String name,String image){
		super(type,name,image);
	}
	/**
	 * Makes a card with only battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public AdventureCard(String type,String name,String image,int stats1){
		super(type,name,image);
		
		setStats1(stats1);
	}
	/**
	 * Makes a card with bid value as the main stat
	 * @param type
	 * @param name
	 * @param image
	 * @param isBid
	 * @param stats1
	 */
	public AdventureCard(String type,String name,String image,boolean isBid,int stats1){
		super(type,name,image);
		
		setIsBid(isBid);
		setStats1(stats1);
	}
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
	public AdventureCard(String type,String name,String image,boolean isBid,boolean isAlsoBp,int stats1,int stats2){
		super(type,name,image);
		
		setIsBid(isBid);
		setIsAlsoBp(isAlsoBp);
		setStats1(stats1);
		setStats2(stats2);
	}
	/**
	 * Makes a card that only has an effect
	 * @param effectIndex 
	 * @param type
	 * @param name
	 * @param image
	 */
	public AdventureCard(int effectIndex,String type,String name,String image){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
	}
	/**
	 * Makes a card with battle value and non-stat effect
	 * @param effectIndex
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public AdventureCard(int effectIndex,String type,String name,String image,int stats1){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setStats1(stats1);
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
	public AdventureCard(int effectIndex,String type,String name,String image,int stats1,int stats2){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setStats1(stats1);
		setStats2(stats2);
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
	public AdventureCard(int effectIndex,String type,String name,String image,boolean isBid,int stats1,int stats2){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setIsBid(isBid);
		setStats1(stats1);
		setStats2(stats2);
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
	public AdventureCard(int effectIndex,String type,String name,String image,boolean isBid,boolean isAlsoBp,int stats1,int stats2){
		super(type,name,image);
		
		setEffectIndex(effectIndex);
		setIsBid(isBid);
		setIsAlsoBp(isAlsoBp);
		setStats1(stats1);
		setStats2(stats2);
	}
	/**
	 * Makes a card with minimum bid limit
	 * @param isBidMin
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public AdventureCard(boolean isBidMin,String type,String name,String image,int stats1){
		super(type,name,image);
		
		setIsBidMin(isBidMin);
		setStats1(stats1);
	}
	/**
	 * @return effectIndex
	 */
	public int getEffect() {
		return effectIndex;
	}
	/**
	 * @param effectIndex
	 */
	public static void setEffectIndex(int effectIndex) {
		AdventureCard.effectIndex = effectIndex;
	}
	/**
	 * @return stats1
	 */
	public int getStats1() {
		return stats1;
	}
	/**
	 * @param stats1
	 */
	public static void setStats1(int stats1) {
		AdventureCard.stats1 = stats1;
	}
	/**
	 * @return stats2
	 */
	public int getStats2() {
		return stats2;
	}
	/**
	 * @param stats2
	 */
	public static void setStats2(int stats2) {
		AdventureCard.stats2 = stats2;
	}
	/**
	 * @return isBid
	 */
	public boolean getIsBid() {
		return isBid;
	}
	/**
	 * @param isBid
	 */
	public static void setIsBid(boolean isBid) {
		AdventureCard.isBid = isBid;
	}
	/**
	 * @return forTable
	 */
	public static boolean getForTable() {
		return forTable;
	}
	/**
	 * @param forTable
	 */
	public static void setForTable(boolean forTable) {
		AdventureCard.forTable = forTable;
	}
	/**
	 * @return inPlay
	 */
	public static boolean getInPlay() {
		return inPlay;
	}
	/**
	 * @param inPlay
	 */
	public static void setInPlay(boolean inPlay) {
		AdventureCard.inPlay = inPlay;
	}
	/**
	 * @return inDiscard
	 */
	public static boolean getInDiscard() {
		return inDiscard;
	}
	/**
	 * @param inDiscard
	 */
	public static void setInDiscard(boolean inDiscard) {
		AdventureCard.inDiscard = inDiscard;
	}
	/**
	 * @return isFaceDown 
	 */
	public static boolean getIsFaceDown() {
		return isFaceDown;
	}
	/**
	 * @param isFaceDown  
	 */
	public static void setIsFaceDown(boolean isFaceDown) {
		AdventureCard.isFaceDown = isFaceDown;
	}
	/**
	 * @return lengthInPlay
	 */
	public static int getLengthInPlay() {
		return lengthInPlay;
	}
	/**
	 * @param lengthInPlay
	 */
	public static void setLengthInPlay(int lengthInPlay) {
		AdventureCard.lengthInPlay = lengthInPlay;
	}
	/**
	 * @return isWeapon
	 */
	public static boolean getIsWeapon() {
		return isWeapon;
	}
	/**
	 * @param isWeapon
	 */
	public static void setIsWeapon(boolean isWeapon) {
		AdventureCard.isWeapon = isWeapon;
	}
	/**
	 * @return isAlsoBp
	 */
	public static boolean getIsAlsoBp() {
		return isAlsoBp;
	}
	/**
	 * @param isAlsoBp
	 */
	public static void setIsAlsoBp(boolean isAlsoBp) {
		AdventureCard.isAlsoBp = isAlsoBp;
	}
	/**
	 * @return isBidMin
	 */
	public static boolean getIsBidMin() {
		return isBidMin;
	}
	/**
	 * @param isBidMin
	 */
	public static void setIsBidMin(boolean isBidMin) {
		AdventureCard.isBidMin = isBidMin;
	}
}