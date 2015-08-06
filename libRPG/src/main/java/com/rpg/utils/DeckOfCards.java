package com.rpg.utils;

import java.util.ArrayList;
import java.util.Random;

import org.apache.log4j.Logger;

import com.rpg.random.PlayingCard;

public class DeckOfCards {	
	private Random r;
	
	private ArrayList<PlayingCard> deckOfCards;
	private ArrayList<Integer> alreadyDrawnCards;

	private boolean jokers;

	public DeckOfCards(boolean includeJokers) {
		this.jokers = includeJokers;
		initialize();
	}

	private void initialize() {
		this.r = new Random(System.currentTimeMillis());
		this.deckOfCards = new ArrayList<PlayingCard>();
		this.alreadyDrawnCards = new ArrayList<Integer>();
		for (PlayingCard card : PlayingCard.values()) {
			if ((card == PlayingCard.blackJoker || card == PlayingCard.redJoker) && !this.jokers) {
				continue;
			}
			this.deckOfCards.add(card);
		}
	}
	
	public PlayingCard drawCard(){
		if(this.alreadyDrawnCards.size() == this.deckOfCards.size()){
			shuffle();
		}
		
		while(true){
			int picked = r.nextInt(this.deckOfCards.size());
			if(!this.alreadyDrawnCards.contains(picked)){
				this.alreadyDrawnCards.add(picked);
				return this.deckOfCards.get(picked);
			}
		}
	}
	
	public void shuffle(){
		this.alreadyDrawnCards = new ArrayList<Integer>();
	}
}
