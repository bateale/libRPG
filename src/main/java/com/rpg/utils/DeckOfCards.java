package com.rpg.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import com.rpg.random.PlayingCard;

public class DeckOfCards {
	private Random r;

	private ArrayList<PlayingCard> deckOfCards;
	private LinkedList<Integer> remainingCards;

	private boolean jokers;

	public DeckOfCards(boolean includeJokers) {
		this.jokers = includeJokers;
		initialize();
	}

	private void initialize() {
		this.r = new Random(System.currentTimeMillis());
		this.deckOfCards = new ArrayList<PlayingCard>();
		this.remainingCards = new LinkedList<Integer>();
		int i = 0;
		for (PlayingCard card : PlayingCard.values()) {
			if ((card == PlayingCard.blackJoker || card == PlayingCard.redJoker)
					&& !this.jokers) {
				continue;
			}
			this.deckOfCards.add(card);
			this.remainingCards.add(i);
			i++;
		}
	}

	public PlayingCard drawCard() {
		if (this.remainingCards.size() == 0) {
			shuffle();
		}

		int position = r.nextInt(this.remainingCards.size());
		int drawnCard = this.remainingCards.get(position);
		this.remainingCards.remove(position);
		
		return this.deckOfCards.get(drawnCard);
	}

	public void shuffle() {
		this.remainingCards.clear();
		for (int i = 0; i < this.deckOfCards.size(); i++) {
			this.remainingCards.add(i);
		}
	}
}
