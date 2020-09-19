package vista;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import vista.MainView.Player;

public class BackEnd {

	private List<List<Integer>> winCases = new ArrayList<List<Integer>>();
	
	private Player[]  plays = new Player[9];
	
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
	
	
	public boolean processPlay(Player playerMove, Integer button) {
		plays[button] = playerMove;
		return hayGanador(playerMove);
	}
	
	
	public boolean hayGanador(Player playerMove) {
		
		List<List<Integer>> possibleWins = getWinCases();
		Integer index = 0;
		
		while(!possibleWins.isEmpty() &&  index < plays.length) {
			Player play = plays[index]; 
			
			++index;
			
			if(!playerMove.equals(play)) {
				possibleWins = filterWinConditions(possibleWins, index);
			}
		}
		
		if(!possibleWins.isEmpty()) {
			System.out.println("ganaste capo " + playerMove);
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

	public List<List<Integer>> getWinCases() {
		return this.winCases;
	}
	
}
