package com.ge.www;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ArenaTest {

	 @Test
	    public void testPlayerTakesDamage() {
	        Player player = new Player(100, 10, 5);
	        player.takeDamage(30);
	        assertEquals(70, player.getHealth(), "Health should be 70 after taking 30 damage");
	    }

	    @Test
	    public void testPlayerDiesAtZeroHealth() {
	        Player player = new Player(20, 10, 5);
	        player.takeDamage(30);
	        assertTrue(player.isDead(), "Player should be dead after taking lethal damage");
	    }
	    
	    @Test
	    public void testFightResult() {
	        Player playerA = new Player(50, 5, 10);
	        Player playerB = new Player(100, 10, 5);
	        Arena arena = new Arena(playerA, playerB);
	        Player winner = arena.startFight();
	        assertTrue(winner == playerA || winner == playerB, "Winner should be either Player A or Player B");
	    }

}
