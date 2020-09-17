package javaTicTacToe;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import vista.BackEnd;
import vista.MainView.Player;

class TestBackEnd {
	
	BackEnd back = new BackEnd();

	@Test
	void test() {
		allWinSituations();
	}
	
	
	void allWinSituations()  {
		//HORIZONTAL
		
		Player playerThisTurn = Player.X;
		
		assertFalse(back.processPlay(playerThisTurn, 0));
		assertFalse(back.processPlay(playerThisTurn, 1));
		assertTrue(back.processPlay(playerThisTurn, 2));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 3));
		assertFalse(back.processPlay(playerThisTurn, 4));
		assertTrue(back.processPlay(playerThisTurn, 5));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 6));
		assertFalse(back.processPlay(playerThisTurn, 7));
		assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		//VERTICAL
		
		assertFalse(back.processPlay(playerThisTurn, 0));
		assertFalse(back.processPlay(playerThisTurn, 3));
		assertTrue(back.processPlay(playerThisTurn, 6));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 1));
		assertFalse(back.processPlay(playerThisTurn, 4));
		assertTrue(back.processPlay(playerThisTurn, 7));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 2));
		assertFalse(back.processPlay(playerThisTurn, 5));
		assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		//DIAGONALES
		
		assertFalse(back.processPlay(playerThisTurn, 0));
		assertFalse(back.processPlay(playerThisTurn, 4));
		assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 2));
		assertFalse(back.processPlay(playerThisTurn, 4));
		assertTrue(back.processPlay(playerThisTurn, 6));
		
		back.reset();
		
		//TOROIDALES
		
		assertFalse(back.processPlay(playerThisTurn, 1));
		assertFalse(back.processPlay(playerThisTurn, 3));
		assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 7));
		assertFalse(back.processPlay(playerThisTurn, 5));
		assertTrue(back.processPlay(playerThisTurn, 0));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 7));
		assertFalse(back.processPlay(playerThisTurn, 3));
		assertTrue(back.processPlay(playerThisTurn, 2));
		
		back.reset();
		
		assertFalse(back.processPlay(playerThisTurn, 1));
		assertFalse(back.processPlay(playerThisTurn, 5));
		assertTrue(back.processPlay(playerThisTurn, 6));
		
	}

}
