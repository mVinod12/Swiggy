package com.arena;

public class Arena {

	
	    private Player playerA;
	    private Player playerB;
	    private Dice dice;

	    public Arena(Player playerA, Player playerB) {
	        this.playerA = playerA;
	        this.playerB = playerB;
	        this.dice = new Dice();
	    }

	    public Player startFight() {
	        while (!playerA.isDead() && !playerB.isDead()) {
	            playTurn(playerA, playerB);
	            if (playerB.isDead()) break;
	            playTurn(playerB, playerA);
	        }
	        return playerA.isDead() ? playerB : playerA;
	    }

	    private void playTurn(Player attacker, Player defender) {
	        int attackRoll = dice.roll();
	        int defenseRoll = dice.roll();

	        int attackDamage = attacker.getAttackValue() * attackRoll;
	        int defenseStrength = defender.getStrengthValue() * defenseRoll;

	        int damageToDefender = attackDamage - defenseStrength;
	        if (damageToDefender > 0) {
	            defender.takeDamage(damageToDefender);
	        }
	    }
	}

	


