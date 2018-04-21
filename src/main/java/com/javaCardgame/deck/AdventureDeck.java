package com.javaCardgame.deck;
import java.util.*;

import com.javaCardgame.card.*;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 15 2018
 * Private project done to increase understanding of Java FX
 * Adventure card deck for Quest of the Round Table
 */
public class AdventureDeck extends Deck{
	private static final String[] NAMES = {
		"SirGawain",
		"KingPellinore",
		"SirPercival",
		"SirTristan",
		"KingArthur",
		"QueenGuinevere",
		"Merlin",
		"QueenIseult",
		"SirLancelot",
		"SirGalahad",
		"Dragon",
		"GreenKnight",
		"Giant",
		"TestOfTheQuestingBeast",
		"TestOfTemptation",
		"TestOfValor",
		"TestOfMorganLeFey",
		"Excalibur",
		"BlackKnight",
		"Boar",
		"Saxons",
		"Mordred",
		"EvilKnight",
		"Dagger",
		"Lance",
		"RobberKnight",
		"Amour",
		"Thieves",
		"SaxonKnight",
		"Battle-ax",
		"Horse",
		"Sword"
	};	
	/**
	 * Makes an empty ArrayList<Card> to fit all adventure cards
	 * @param isDraw determines whether to fill the deck
	 */
	public AdventureDeck(boolean isDraw) {
		super(new ArrayList<Card>(125));
		
		if (isDraw) {
			CardStorage[] allAdventureCards = createAllAdventureCards();			
			ArrayList<Card> adventureDeck   = new ArrayList<Card>(125);
			
			initDeck(adventureDeck,allAdventureCards);
			Collections.shuffle(adventureDeck);
			setDeck(adventureDeck);
		}
	}
	/**
	 * Forms an array of adventure Cards
	 * @return allAdventureCards
	 */
	public CardStorage[] createAllAdventureCards() {
		CardStorage[] allAdventureCards = {
			new CardStorage(1,new AllyCard(1,"Ally","","",10,10)),
			new CardStorage(1,new AllyCard(2,"Ally","","",true,true,10,4)),
			new CardStorage(1,new AllyCard(3,"Ally","","",5,15)),
			new CardStorage(1,new AllyCard(4,"Ally","","",10,10)),
			new CardStorage(1,new AllyCard("Ally","","",true,true,10,2)),
			new CardStorage(1,new AllyCard("Ally","","",true,3)),
			new CardStorage(1,new AllyCard(5,"Ally","","")),
			new CardStorage(1,new AllyCard(6,"Ally","","",true,2,1)),
			new CardStorage(1,new AllyCard(7,"Ally","","",15,10)),
			new CardStorage(1,new AllyCard("Ally","","",15)),
			new CardStorage(1,new FoeCard(14,"Foe","","",50,70)),
			new CardStorage(2,new FoeCard(18,"Foe","","",25,40)),
			new CardStorage(2,new FoeCard("Foe","","",40)),
			new CardStorage(2,new TestCard(true,"Test","","",4)),
			new CardStorage(2,new TestCard("Test","","")),
			new CardStorage(2,new TestCard("Test","","")),
			new CardStorage(2,new TestCard(true,"Test","","",3)),
			new CardStorage(2,new WeaponCard("Weapon","","",30)),
			new CardStorage(3,new FoeCard(17,"Foe","","",25,35)),
			new CardStorage(4,new FoeCard(16,"Foe","","",5,15)),
			new CardStorage(5,new FoeCard(15,"Foe","","",10,20)),
			new CardStorage(5,new FoeCard(8,"Foe","","",30)),
			new CardStorage(6,new FoeCard(13,"Foe","","",20,30)),
			new CardStorage(6,new WeaponCard("Weapon","","",5)),
			new CardStorage(6,new WeaponCard("Weapon","","",20)),
			new CardStorage(7,new FoeCard("Foe","","",15)),
			new CardStorage(8,new AmourCard("Amour","","",true,true,10,1)),
			new CardStorage(8,new FoeCard("Foe","","",5)),
			new CardStorage(8,new FoeCard(15,"Foe","","",15,25)),
			new CardStorage(8,new WeaponCard("Weapon","","",15)),
			new CardStorage(11,new WeaponCard("Weapon","","",10)),
			new CardStorage(16,new WeaponCard("Weapon","","",10))	
		};
		initCardStorage(allAdventureCards,NAMES);
		return allAdventureCards;
	}
}