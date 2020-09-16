package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

	private final  List<ArrayList<Integer>> winSituations = new ArrayList<ArrayList<Integer>>();
	
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
	
	private List<Character>  plays = new ArrayList<Character>(9);
	
	BackEnd(){
		//initialize winSituations
	}
	
	
	public boolean processPlay(Character playerMove, Integer button) {
		plays.add(button, playerMove);
		return hayGanador(playerMove);
	}
	
	
	public boolean hayGanador(Character playerMove) {
		
		List<ArrayList<Integer>> possibleWins = this.getWinSituations();
		Integer index = 0;
		
		while(!possibleWins.isEmpty() &&  index < plays.size()) {
			Character play = plays.get(index); 
			++index;
			
			if(!playerMove.equals(play)) {
				possibleWins = filterWinConditions(possibleWins, index);
			}
		}
		
		return !possibleWins.isEmpty();
		
	}
	
	public List<ArrayList<Integer>> filterWinConditions(List<ArrayList<Integer>> possibleWins, Integer index){
		return  possibleWins.stream()
				.filter(winCondition -> !winCondition.contains(index))
				.collect(Collectors.toList());
	}


	public  List<Character> getPlays() {
		return this.plays;
	}

	public List<ArrayList<Integer>> getWinSituations() {
		return this.winSituations;
	}
}
