package com.javaCardgame.deck;
import java.util.*;

import com.javaCardgame.card.Card;
import com.javaCardgame.card.EventCard;
import com.javaCardgame.card.QuestCard;
import com.javaCardgame.card.TournamentCard;
/**
 * @author Eric Fletcher
 * @author Prady Rao
 * @date April 15 2018
 * Private project done to increase understanding of Java FX
 * Adventure card deck for Quest of the Round Table
 */
public class StoryDeck extends Deck{
	private static final String[] NAMES = {
		"ChivalrousDeed",
		"Pox",
		"Plague",
		"King'sCallToArms",
		"ProsperityThroughoutTheRealm",
		"JourneyThroughTheEnchantedForest",
		"SearchForTheQuestingBeast",
		"DefendTheQueen'sHonor",
		"SlayTheDragon",
		"RescueTheFairMaiden",
		"SearchForTheHolyGrail",
		"TestOfTheGreenKnight",
		"AtCamelot",
		"AtOrkney",
		"AtTintagel",
		"AtYork",
		"King'sRecognition",
		"Queen'sFavor",
		"CourtCalledToCamelot",
		"VanquishKingArthur'sEnemies",
		"RepelTheSaxonsRaiders",
		"BoarHunt",
	};
	/**
	 * Makes an empty ArrayList<Card> to fit all story cards
	 * @param isDraw determines whether to fill the deck
	 */
	public StoryDeck(boolean isDraw) {
		super(new ArrayList<Card>(28));
		
		if (isDraw) {
			CardStorage[] allStoryCards = createAllStoryCards();			
			ArrayList<Card> storyDeck   = new ArrayList<Card>(28);
			
			initDeck(storyDeck,allStoryCards);
			Collections.shuffle(storyDeck);
			setDeck(storyDeck);
		}
	}
	/**
	 * Forms an array of story Cards
	 * @return allStoryCards
	 */
	public CardStorage[] createAllStoryCards() {
		CardStorage[] allStoryCards = {
			new CardStorage(1,new EventCard(9,"Event","","",3,true,false,false)),
			new CardStorage(1,new EventCard(10,"Event","","",-1,true,false,false)),
			new CardStorage(1,new EventCard(11,"Event","","",-2,true,false,false)),
			new CardStorage(1,new EventCard(11,"Event","","",-1,-2,false,true,false)),
			new CardStorage(1,new EventCard(12,"Event","","",2,false,true,false)),
			new CardStorage(1,new QuestCard("Quest","","",3)),
			new CardStorage(1,new QuestCard("Quest","","",4)),
			new CardStorage(1,new QuestCard("Quest","","",4)),
			new CardStorage(1,new QuestCard("Quest","","",3)),
			new CardStorage(1,new QuestCard("Quest","","",3)),
			new CardStorage(1,new QuestCard("Quest","","",5)),
			new CardStorage(1,new QuestCard("Quest","","",4)),
			new CardStorage(1,new TournamentCard(19,"Tournament","","",3)),
			new CardStorage(1,new TournamentCard(19,"Tournament","","",2)),
			new CardStorage(1,new TournamentCard(19,"Tournament","","",1)),
			new CardStorage(1,new TournamentCard(19,"Tournament","","",0)),
			new CardStorage(2,new EventCard(20,"Event","","",2,true,false,false)),
			new CardStorage(2,new EventCard(21,"Event","","",2,false,true,false)),
			new CardStorage(2,new EventCard(12,"Event","","",-10,false,false,true)),
			new CardStorage(2,new QuestCard("Quest","","",3)),
			new CardStorage(2,new QuestCard("Quest","","",2)),
			new CardStorage(2,new QuestCard("Quest","","",2)),
		};
		initCardStorage(allStoryCards,NAMES);
		return allStoryCards;
	}
}