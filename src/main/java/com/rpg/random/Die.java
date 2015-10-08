package com.rpg.random;

import java.util.Random;

public enum Die {
	d2(2),
	d4(4),
	d6(6),
	d8(8),
	d10(10),
	d12(12),
	d20(20),
	d100(100);

	private int sides;
	private Random r;
	private Die(int sides) {
		this.r = new Random(System.currentTimeMillis());
		this.sides = sides;
	}

	public int roll() {
		return (r.nextInt(this.sides) + 1);
	}
	
	public int getSides(){
		return this.sides;
	}
}
