package com.ge.www;

import java.util.Random;

public class Dice {
	
	private static final int SIDES = 6;
    private Random random = new Random();

    public int roll() {
        return random.nextInt(SIDES) + 1;
    }

}
