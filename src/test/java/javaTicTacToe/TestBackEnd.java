package javaTicTacToe;

import org.junit.jupiter.api.Assertions;
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
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 0));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 1));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 2));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 3));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 4));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 5));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 6));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 7));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		//VERTICAL
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 0));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 3));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 6));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 1));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 4));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 7));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 2));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 5));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		//DIAGONALES
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 0));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 4));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 2));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 4));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 6));
		
		back.reset();
		
		//TOROIDALES
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 1));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 3));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 8));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 7));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 5));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 0));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 7));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 3));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 2));
		
		back.reset();
		
		Assertions.assertFalse(back.processPlay(playerThisTurn, 1));
		Assertions.assertFalse(back.processPlay(playerThisTurn, 5));
		Assertions.assertTrue(back.processPlay(playerThisTurn, 6));
		
	}

}
