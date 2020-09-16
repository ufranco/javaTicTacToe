package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

;

public class BackEnd {

	
	private final  List<ArrayList<Integer>> winSituations = new ArrayList<ArrayList<Integer>>();
	
//	(1,2,3),
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
		
	}
	
	
	public boolean processPlay(Character player, Integer button) {
		
		plays.add(button, player);
		return hayGanador();
	}
	
	
	public boolean hayGanador() {
		
		List<ArrayList<Integer>> possibleWins = this.getWinSituations();
		Integer index = 0;
		
		
		while(!possibleWins.isEmpty() &&  index < plays.size()) {
			
			Character play = plays.get(index); 
			++index;
			
			if(!play.equals(play)) {
				possibleWins = filtrarWinConditions(possibleWins, index);
			}
		}
		
		return !possibleWins.isEmpty();
		
	}
	
	public List<ArrayList<Integer>> filtrarWinConditions(List<ArrayList<Integer>> possibleWins, Integer index){
		return  possibleWins.stream()
				.filter(winCondition -> !winCondition.contains(index))
				.collect(Collectors.toList());
	}


	public  List<Character> getPlays() {
		return this.plays;
	}


	public void setPlays(List<Character> plays) {
		this.plays = plays;
	}


	public List<ArrayList<Integer>> getWinSituations() {
		return this.winSituations;
	}
}
