package com.ge.www;

public class Player {
	    private int health;
	    private int strength;
	    private int attack;

	    public Player(int health, int strength, int attack) {
	        this.health = health;
	        this.strength = strength;
	        this.attack = attack;
	    }

	    public boolean isDead() {
	        return health <= 0;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public int getAttackValue() {
	        return attack;
	    }

	    public int getStrengthValue() {
	        return strength;
	    }

	    public void takeDamage(int damage) {
	        health -= damage;
	        if (health < 0) health = 0;
	    }
	}


