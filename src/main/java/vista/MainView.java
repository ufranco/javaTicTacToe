package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MainView {
	
	public Player playerThisTurn;
	private JLabel playingLabel;
	private Boolean gameEnded;
	private Player playerOne;
	private Player playerTwo;
	
	private BackEnd backEnd = new BackEnd();
	private JFrame frame;
	private JPanel panel;


	public MainView(Player p1, Player p2) {
		initialize(p1,p2);
	}

	private void initialize(Player p1, Player p2) {	
		
		playerOne = p1;
		playerTwo = p2;
		playerThisTurn= playerOne;
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		
		final JButton btn1 = new JButton("");
		btn1.setFont(new Font("Arial", Font.BOLD, 24));
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn1 ,0);
			}
		});
		panel.setLayout(null);
		
		btn1.setBounds(302, 181, 60, 60);
		panel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Arial", Font.BOLD, 24));
		
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn2 ,1 );
			}
		});
		btn2.setBounds(372, 181, 60, 60);
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Arial", Font.BOLD, 24));
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn3 ,2);
			}
		});
		btn3.setBounds(442, 181, 60, 60);
		panel.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Arial", Font.BOLD, 24));
		
		btn4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn4,3);
			}
		});
		btn4.setBounds(302, 252, 60, 60);
		panel.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Arial", Font.BOLD, 24));
		btn5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn5,4);
			}
		});
		btn5.setBounds(372, 252, 60, 60);
		panel.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Arial", Font.BOLD, 24));
		btn6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn6, 5);
			}
		});
		btn6.setBounds(442, 252, 60, 60);
		panel.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Arial", Font.BOLD, 24));
		btn7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn7, 6);
			}
		});
		btn7.setBounds(302, 323, 60, 60);
		panel.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Arial", Font.BOLD, 24));
		btn8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {	
				botonTablero(btn8, 7);
			}
		});
		btn8.setBounds(372, 323, 60, 60);
		panel.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Arial", Font.BOLD, 24));
		btn9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				botonTablero(btn9, 8);
			}
		});
		btn9.setBounds(442, 323, 60, 60);
		panel.add(btn9);
		
		playingLabel = new JLabel("Playing: " + playerThisTurn.getNickName());
		playingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playingLabel.setFont(new Font("Arial", Font.BOLD, 24));
		playingLabel.setBounds(255, 73, 284, 29);
		panel.add(playingLabel);

	}
	
	public void changeTurn(Player lastMove) {
		playerThisTurn = lastMove.equals(this.playerOne)? this.playerTwo : this.playerOne;
		playingLabel.setText("Playing: "+ playerThisTurn.getNickName());
		
	}

	public Boolean getGameEnded() {
		return gameEnded;
	}

	public void setGameEnded(Boolean gameEnded) {
		this.gameEnded = gameEnded;
	}

	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}

	public Player getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JPanel getPanel() {
		return panel;
	}
	
	private void botonTablero(JButton boton, int index) {
		boton.setText(playerThisTurn.getPlayerSignature().toString());
		backEnd.processPlay(playerThisTurn.getPlayerSignature(), index);
		changeTurn(playerThisTurn);
		boton.setEnabled(false);
	}
	

}
