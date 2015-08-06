package com.rpg.random;

public enum CardSuit {
	None(0),
	CLUBS(1),
	DIAMONDS(2),
	HEARTS(3),
	SPADES(4);
	
	private int value;
	private CardSuit(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
}
