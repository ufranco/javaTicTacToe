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

import vista.MainView.Player;

public class BackEnd {

	private List<List<Integer>> winSituations = new ArrayList<List<Integer>>();
	private InputStream cosoWin;

	
	private Player[]  plays = new Player[9];
	
	public BackEnd(){
		try {
		String pepe = Files.lines(Paths.get("res/winCases.txt"), StandardCharsets.UTF_8).map(c->c.toString()).collect(Collectors.joining());
		 System.out.println(
				 pepe.split(";")[0]
				 .split(",")[2]);
		 
		 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
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
		
		//Listo el pollo 
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

	public List<List<Integer>> getWinSituations() {
		return this.winSituations;
	}
	
}
