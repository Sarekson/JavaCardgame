package com.javaCardgame.card;

/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Weapon card template for Quest of the Round Table
 */
public class WeaponCard extends AdventureCard{
	/**
	 * Makes a card with only battle value
	 * @param type
	 * @param name
	 * @param image
	 * @param stats1
	 */
	public WeaponCard(String t,String n,String i,int b1) {
		super(t,n,i,b1);
		
		setIsWeapon(true); //because weapons can be ally or foe
		setForTable(true); //set to ally
		setLengthInPlay(1);//indicates 1 stage of quest or 1 tournament
	}
	/**
	 * Treats Weapons as Foes for sponsor
	 */
	public void questSponsor() {
		setForTable(false);
		setIsFaceDown(true);
	}
	/**
	 * Returns Weapons to Allies after quest
	 */
	public void resetWeapon() {
		setForTable(true);
		setIsFaceDown(false);
	}
}