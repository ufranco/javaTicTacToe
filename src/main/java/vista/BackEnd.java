package vista;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BackEnd {

	private List<List<Integer>> winCases = new ArrayList<List<Integer>>();
	
	private PlayerEnums[]  plays = new PlayerEnums[9];
	
	public BackEnd(){
			
		String unformattedWinCases = "";
		try {
			
			unformattedWinCases = Files.lines(Paths.get("res/winCases.txt"), StandardCharsets.UTF_8)
										.collect(Collectors.joining());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.winCases = Arrays.stream(unformattedWinCases.split(";"))
								.map(winSituation -> Arrays.stream(winSituation.split(","))
										.map(Integer::parseInt)
										.collect(Collectors.toList())
								)
								.collect(Collectors.toList());
	}
	
	
	public boolean processPlay(PlayerEnums playerMove, Integer button) {
		plays[button] = playerMove;
		return hayGanador(playerMove);
	}
	
	
	public boolean hayGanador(PlayerEnums playerMove) {
		
		List<List<Integer>> possibleWins = getWinCases();
		Integer index = 0;
		boolean hayGanador = false;
		while(!possibleWins.isEmpty() &&  index < plays.length) {
			PlayerEnums play = plays[index]; 
			
			++index;
			
			if(!playerMove.equals(play)) {
				possibleWins = filterWinConditions(possibleWins, index);
			}
		}
		
		if(!possibleWins.isEmpty()) {
			hayGanador = true;
		}
		
		return hayGanador;
	}
	
	public List<List<Integer>> filterWinConditions(List<List<Integer>> possibleWins, Integer index){
		return  possibleWins.stream()
				.filter(winCondition -> !winCondition.contains(index))
				.collect(Collectors.toList());
	}
	
	public void reset(){
		this.plays = new PlayerEnums[9];
	}

	public List<List<Integer>> getWinCases() {
		return this.winCases;
	}
	
}
