package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainView {
	
	public enum PlayerEnums {
		X,
		O,
	}
	
	public Player playerThisTurn;
	private JLabel playingLabel;
	private Boolean gameEnded;
	private Player playerOne;
	private Player playerTwo;
	
	private BackEnd backEnd = new BackEnd();
	private JFrame frame;


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					MainView window = new MainView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainView() {
		
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("res/img/favicon.png"));
		frame.setTitle("totally not a virus.exe");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btn1 = new JButton("");
		btn1.setFont(new Font("Arial", Font.BOLD, 24));
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn1.getText().isEmpty()) {
					return;
				}
				
				btn1.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 0);
				changeTurn(playerThisTurn);
				btn1.setEnabled(false);
			}
		});
		
		btn1.setBounds(291, 170, 64, 64);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Arial", Font.BOLD, 24));
		
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn2.getText().isEmpty()) {
					return;
				}
				
				btn2.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 1);
				changeTurn(playerThisTurn);
				btn2.setEnabled(false);
				
			}
		});
		btn2.setBounds(365, 170, 64, 64);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Arial", Font.BOLD, 24));
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn3.getText().isEmpty()) {
					return;
				}
				
				btn3.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 2);
				changeTurn(playerThisTurn);
				btn3.setEnabled(false);
			}
		});
		btn3.setBounds(439, 170, 64, 64);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Arial", Font.BOLD, 24));
		
		btn4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn4.getText().isEmpty()) {
					return;
				}
				
				btn4.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 3);
				changeTurn(playerThisTurn);
				btn4.setEnabled(false);
			}
		});
		btn4.setBounds(291, 245, 64, 64);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Arial", Font.BOLD, 24));
		btn5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn5.getText().isEmpty()) {
					return;
				}
				
				btn5.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 4);
				changeTurn(playerThisTurn);
				btn5.setEnabled(false);
			}
		});
		btn5.setBounds(365, 245, 64, 64);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Arial", Font.BOLD, 24));
		btn6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn6.getText().isEmpty()) {
					return;
				}
				
				btn6.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 5);
				changeTurn(playerThisTurn);
				btn6.setEnabled(false);
			}
		});
		btn6.setBounds(439, 245, 64, 64);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Arial", Font.BOLD, 24));
		btn7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn7.getText().isEmpty()) {
					return;
				}
				
				btn7.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 6);
				changeTurn(playerThisTurn);
				btn7.setEnabled(false);
			}
		});
		btn7.setBounds(291, 320, 64, 64);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Arial", Font.BOLD, 24));
		btn8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn8.getText().isEmpty()) {
					return;
				}
				
				btn8.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 7);
				changeTurn(playerThisTurn);
				btn8.setEnabled(false);
			}
		});
		btn8.setBounds(365, 320, 64, 64);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Arial", Font.BOLD, 24));
		btn9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!btn9.getText().isEmpty()) {
					return;
				}
				
				btn9.setText(playerThisTurn.getPlayerSignature().toString());
				backEnd.processPlay(playerThisTurn.getPlayerSignature(), 8);
				changeTurn(playerThisTurn);
				btn9.setEnabled(false);
			}
		});
		btn9.setBounds(439, 320, 64, 64);
		frame.getContentPane().add(btn9);
		
		playingLabel = new JLabel("Playing: " + playerThisTurn);
		playingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playingLabel.setFont(new Font("Arial", Font.BOLD, 24));
		playingLabel.setBounds(298, 45, 205, 71);
		frame.getContentPane().add(playingLabel);
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

}
