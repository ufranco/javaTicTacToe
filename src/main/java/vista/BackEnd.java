package vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import vista.MainView.Player;


//Comentario de cosos para ganar

	//H 123 456 789 estas estan separadas cada 3 posiciones(las posiciones iniciales). 

	//V 147 258 369 estas estan separadas cada 3 (las posiciones ganadoras) 

	//D 159 357 estas estan separadas cada 4 la otra cada 2 xd (las posiciones ganadoras)

	//las especiales **encontrar patron** 

	//F 249 267 843 861 
	
	//  0 0 X    0 X 0  1 2 3 -> 
	//  X 0 0    0 x 0  4 5 6 ->
	//  0 X 0    0 x 0  7 8 9 ->

//

public class BackEnd {

	private List<List<Integer>> winSituations = new ArrayList<List<Integer>>();
	
//	(1,2,3), ingeniarse forma de meter esto en el array de arriba sin hardcodearla duro
//	(4,5,6),
//	(7,8,9),
//	(1,4,7),
//	(2,5,8),
//	(3,6,9),
//	(1,5,9),
//	(3,5,7),
//	(2,4,9),
//	(2,6,7),
//	(8,4,3),
//	(8,6,1),
	
	private Player[]  plays = new Player[9];
	
	public BackEnd(){
		
		Integer[][] harcodeadisimo = new Integer[][] {
			new Integer[]{1,2,3},
			new Integer[]{4,5,6},
			new Integer[]{7,8,9},
			new Integer[]{1,4,7},
			new Integer[]{2,5,8},
			new Integer[]{3,6,9},
			new Integer[]{1,5,9},
			new Integer[]{3,5,7},
			new Integer[]{2,4,9},
			new Integer[]{2,6,7},
			new Integer[]{8,4,3},
			new Integer[]{8,6,1}
		};		
			
		this.winSituations = Arrays.asList(harcodeadisimo).stream()
				.map(array -> Arrays.asList(array))
                .collect(Collectors.toList());
	}
	
	
	public boolean processPlay(Player playerMove, Integer button) {
		plays[button] = playerMove;
		return hayGanador(playerMove);
	}
	
	
	public boolean hayGanador(Player playerMove) {
		
		List<List<Integer>> possibleWins = this.getWinSituations();
		Integer index = 0;
		
		while(!possibleWins.isEmpty() &&  index < plays.length) {
			Player play = plays[index]; 
			
			++index;
			
			if(!playerMove.equals(play)) {
				possibleWins = filterWinConditions(possibleWins, index);
			}
		}
		
		if(!possibleWins.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public List<List<Integer>> filterWinConditions(List<List<Integer>> possibleWins, Integer index){
		return  possibleWins.stream()
				.filter(winCondition -> !winCondition.contains(index))
				.collect(Collectors.toList());
	}
	
	
	public void reset(){
		this.plays = new Player[9];
	}

	public List<List<Integer>> getWinSituations() {
		return this.winSituations;
	}
}
