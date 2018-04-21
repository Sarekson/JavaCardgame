package com.javaCardgame.card;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 10 2018
 * Private project done to increase understanding of Java FX
 * Card template for Quest of the Round Table
 */
public abstract class Card {
	public String type;
	public String name;
	public String image;
	/**
	 * Makes a card with no excess information
	 * @param type
	 * @param name
	 * @param image
	 */
	public Card(String type,String name,String image) {
		this.type  = type;
		this.name  = name;
		this.image = image;
	}
	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}
}