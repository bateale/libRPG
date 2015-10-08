package com.rpg.random;

import java.util.Comparator;

public class PlayingCardComparator implements Comparator<PlayingCard> {

	@Override
	public int compare(PlayingCard one, PlayingCard two) {
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

}
