package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VistaJuego {
	
	public Player playerThisTurn;
	private Boolean gameEnded = false;
	private Player playerOne;
	private Player playerTwo;
	
	private BackEnd backEnd = new BackEnd();

	private JPanel panel;
	private JPanel tablero;
	private JLabel playingLabel;
	private ArrayList<JButton> botones = new ArrayList<JButton>(9);

	public VistaJuego(Player p1, Player p2) {
		initialize(p1,p2);
	}

	private void initialize(Player p1, Player p2) {	
		
		initPlayers(p1,p2);
		initPanel();
		initTablero();
		fillPanel();
		initUi();
	}
	
	private void initUi() {
		
		playingLabel = new JLabel("Playing: " + playerThisTurn.getNickName()); 
		playingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playingLabel.setFont(new Font("Arial", Font.BOLD, 24));
		playingLabel.setBounds(255, 73, 284, 29);
		panel.add(playingLabel);
		
		JLabel player1Icon = new JLabel("iconop1");
		player1Icon.setIcon(playerOne.getAvatar());
		player1Icon.setBounds(10, 11, 128, 128);
		panel.add(player1Icon);
		
		JLabel player2Icon = new JLabel("iconop2");
		player2Icon.setIcon(playerTwo.getAvatar());
		player2Icon.setBounds(646, 11, 128, 128);
		panel.add(player2Icon);
		
		JLabel p1name = new JLabel(playerOne.getNickName());
		p1name.setBounds(20, 160, 118, 14);
		panel.add(p1name);
		
		JLabel p2name = new JLabel(playerTwo.getNickName());
		p2name.setBounds(656, 160, 118, 14);
		panel.add(p2name);
	}

	private void initTablero() {
		tablero = new JPanel();
		tablero.setBackground(Color.WHITE);
		tablero.setBounds(255, 160, 300, 300);
		tablero.setLayout(null);
		fillTablero();
	}

	private void fillTablero() {
		initButtons();
	}

	private void initButtons() {
		int x = 11;
		int y = 11;
		
		for (int i=0 ; i < 9; i++ ) {
			
			int index = i;
			JButton b = new JButton("");
			b.setFont(new Font("Arial", Font.BOLD, 24));
			b.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					botonTablero(b ,index);
			}
			});
			
			if (i%3 == 0) {
				y+=75;
				x=11;
			}
			
			b.setBounds(x, y, 60, 60);
			
			x+=75;
			
			botones.add(b);
			tablero.add(b);
			
		}
	}

	private void fillPanel() {
		panel.add(tablero);
	}

	private void initPanel() {
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		panel.setLayout(null);
		
	}

	private void initPlayers(Player p1, Player p2) {
		playerOne = p1;
		playerTwo = p2;
		playerThisTurn= playerOne;
	}

	public void changeTurn(Player lastMove) {
		playerThisTurn = lastMove.equals(this.playerOne)? this.playerTwo : this.playerOne;
		playingLabel.setText("Playing: "+ playerThisTurn.getNickName());
		
	}

	private void botonTablero(JButton boton, int index) {
		boton.setText(playerThisTurn.getPlayerSignature().toString());
		gameEnded = backEnd.processPlay(playerThisTurn.getPlayerSignature(), index);
		boton.setEnabled(false);
		if (gameEnded) 
			GameOver();
		else
		changeTurn(playerThisTurn);
	}
	
	private void GameOver() {
		Player perdedor = getPerdedor();
		VistaGameOver vgo = new VistaGameOver(playerThisTurn, perdedor);
		this.panel.getParent().add(vgo.getPanel());
		this.panel.setVisible(false);
		this.panel.getParent().remove(this.panel);
	}

	private Player getPerdedor() {
		return playerThisTurn != playerOne? playerOne : playerTwo;
	}

	public JPanel getPanel() {
		return panel;
	}

}
