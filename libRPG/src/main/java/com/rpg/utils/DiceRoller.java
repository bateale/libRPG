package com.rpg.utils;

import org.apache.log4j.Logger;

import com.rpg.random.Die;

public class DiceRoller {

	final static Logger logger = Logger.getLogger(DiceRoller.class);

	public static int roll(Die die) {
		int result = die.roll();
		logger.debug("Rolling 1" + die.name() + ":" + result);
		return result;
	}

	public static int multiRoll(Die die, int numberOfTimes) {
		int result = 0;
		for (int i = 0; i < numberOfTimes; i++) {
			result += roll(die);
		}
		logger.debug("Rolling " + numberOfTimes + die.name() + ":" + result);

		return result;
	}

	public static int rollWithMod(Die die, int modifier) {
		int result = die.roll() + modifier;
		logger.debug("Rolling 1" + die.name() + "+" + modifier + ":" + result);
		return result;
	}

	public static int multiRollWithMod(Die die, int numberOfTimes, int modifier) {
		int result = 0;
		for (int i = 0; i < numberOfTimes; i++) {
			result += roll(die);
		}
		result += modifier;
		logger.debug("Rolling " + numberOfTimes + die.name() + "+" + modifier + ":" + result);

		return result;
	}

}
