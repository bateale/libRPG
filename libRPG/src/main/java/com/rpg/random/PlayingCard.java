package com.rpg.random;

public enum PlayingCard {
	clubs2("Two of Clubs", 2, CardSuit.CLUBS),
	clubs3("Three of Clubs", 3, CardSuit.CLUBS),
	clubs4("Four of Clubs", 4, CardSuit.CLUBS),
	clubs5("Five of Clubs", 5, CardSuit.CLUBS),
	clubs6("Six of Clubs", 6, CardSuit.CLUBS),
	clubs7("Seven of Clubs", 7, CardSuit.CLUBS),
	clubs8("Eight of Clubs", 8, CardSuit.CLUBS),
	clubs9("Nine of Clubs", 9, CardSuit.CLUBS),
	clubs10("Ten of Clubs", 10, CardSuit.CLUBS),
	clubsJack("Jack of Clubs", 11, CardSuit.CLUBS),
	clubsQueen("Queen of Clubs", 12, CardSuit.CLUBS),
	clubsKing("King of Clubs", 13, CardSuit.CLUBS),
	clubsAce("Ace of Clubs", 14, CardSuit.CLUBS),

	diamonds2("Two of Diamonds", 2, CardSuit.DIAMONDS),
	diamonds3("Three of Diamonds", 3, CardSuit.DIAMONDS),
	diamonds4("Four of Diamonds", 4, CardSuit.DIAMONDS),
	diamonds5("Five of Diamonds", 5, CardSuit.DIAMONDS),
	diamonds6("Six of Diamonds", 6, CardSuit.DIAMONDS),
	diamonds7("Seven of Diamonds", 7, CardSuit.DIAMONDS),
	diamonds8("Eight of Diamonds", 8, CardSuit.DIAMONDS),
	diamonds9("Nine of Diamonds", 9, CardSuit.DIAMONDS),
	diamonds10("Ten of Diamonds", 10, CardSuit.DIAMONDS),
	diamondsJack("Jack of Diamonds", 11, CardSuit.DIAMONDS),
	diamondsQueen("Queen of Diamonds", 12, CardSuit.DIAMONDS),
	diamondsKing("King of Diamonds", 13, CardSuit.DIAMONDS),
	diamondsAce("Ace of Diamonds", 14, CardSuit.DIAMONDS),

	hearts2("Two of Hearts", 2, CardSuit.HEARTS),
	hearts3("Three of Hearts", 3, CardSuit.HEARTS),
	hearts4("Four of Hearts", 4, CardSuit.HEARTS),
	hearts5("Five of Hearts", 5, CardSuit.HEARTS),
	hearts6("Six of Hearts", 6, CardSuit.HEARTS),
	hearts7("Seven of Hearts", 7, CardSuit.HEARTS),
	hearts8("Eight of Hearts", 8, CardSuit.HEARTS),
	hearts9("Nine of Hearts", 9, CardSuit.HEARTS),
	hearts10("Ten of Hearts", 10, CardSuit.HEARTS),
	heartsJack("Jack of Hearts", 11, CardSuit.HEARTS),
	heartsQueen("Queen of Hearts", 12, CardSuit.HEARTS),
	heartsKing("King of Hearts", 13, CardSuit.HEARTS),
	heartsAce("Ace of Hearts", 14, CardSuit.HEARTS),

	spades2("Two of Spades", 2, CardSuit.SPADES),
	spades3("Three of Spades", 3, CardSuit.SPADES),
	spades4("Four of Spades", 4, CardSuit.SPADES),
	spades5("Five of Spades", 5, CardSuit.SPADES),
	spades6("Six of Spades", 6, CardSuit.SPADES),
	spades7("Seven of Spades", 7, CardSuit.SPADES),
	spades8("Eight of Spades", 8, CardSuit.SPADES),
	spades9("Nine of Spades", 9, CardSuit.SPADES),
	spades10("Ten of Spades", 10, CardSuit.SPADES),
	spadesJack("Jack of Spades", 11, CardSuit.SPADES),
	spadesQueen("Queen of Spades", 12, CardSuit.SPADES),
	spadesKing("King of Spades", 13, CardSuit.SPADES),
	spadesAce("Ace of Spades", 14, CardSuit.SPADES),

	blackJoker("Black Joker", 15, CardSuit.None),
	redJoker("Red Joker", 15, CardSuit.None);

	private String name;
	private int value;
	private CardSuit suit;

	private PlayingCard(String name, int value, CardSuit suit) {
		this.name = name;
		this.value = value;
		this.suit = suit;
	}

	/**
	 * If one comes before two, return -1 If one equals two, return 0 If one
	 * comes after two, return 1
	 * 
	 * If values are the same, then it checks reverse alphabetical order If one
	 * is spades2 and two is hearts2, return 1 If one is clubsQueen and two is
	 * diamondsQueen, return -1
	 * 
	 * Jokers are always higher than any other card. Black joker equals red joker
	 * 
	 * @return
	 */
	public static int compare(PlayingCard one, PlayingCard two) {
		if (one.getValue() > two.getValue()) {
			return 1;
		} else if (one.getValue() < two.getValue()) {
			return -1;
		} else {
			if (one.getSuit().getValue() > two.getSuit().getValue()) {
				return 1;
			} else if (one.getSuit().getValue() < two.getSuit().getValue()) {
				return -1;
			}
		}
		return 0;
	}

	public String getName() {
		return this.name;
	}

	public int getValue() {
		return this.value;
	}

	public CardSuit getSuit() {
		return this.suit;
	}
	
	@Override public String toString(){
		return getName();
	}
}
