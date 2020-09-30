package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class PlaySetup {
	private JFrame frame;
	private JPanel panel;
	
	private JTextField nameTextFieldX;
	private JTextField nameTextFieldO;
	
	private Player player1, player2;
	private int altoIcon = 128;
	private int anchoIcon = 128;
	
	PlayerEnums playersSignatures;
	
	private String pathIconX, pathIconO;
	private JLabel iconoP1, iconoP2;
	private JButton playButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlaySetup window = new PlaySetup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PlaySetup() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		pathIconX = "res/img/blanco.png";
		pathIconO = "res/img/negro.png";
		
		player1 = new Player();
		player1.setNickName("player 1");
		player1.setAvatar(herramientas.CargarImagenes.cargarIcon(pathIconX, anchoIcon, altoIcon));
		player1.setPlayerSignature(PlayerEnums.X);
		
		player2 = new Player();
		player2.setNickName("player 2");
		player2.setAvatar(herramientas.CargarImagenes.cargarIcon(pathIconO, anchoIcon, altoIcon));
		player2.setPlayerSignature(PlayerEnums.O);
		
		
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		nameTextFieldX = new JTextField();
		nameTextFieldX.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

               player1.setNickName(nameTextFieldX.getText());

            }});
		
		nameTextFieldX.setBounds(10, 335, 147, 20);
		panel.add(nameTextFieldX);
		nameTextFieldX.setColumns(10);
		
		
		
		
		JLabel nameLabelX = new JLabel("Ingrese su nombre:");
		nameLabelX.setBounds(48, 310, 128, 14);
		panel.add(nameLabelX);
		
		iconoP1 = new JLabel("");
		iconoP1.setIcon(player1.getAvatar());
		iconoP1.setBounds(10, 118, 128, 128);
		panel.add(iconoP1);
		
		nameTextFieldO = new JTextField();
		nameTextFieldO.setColumns(10);
		nameTextFieldO.setBounds(627, 335, 147, 20);
		nameTextFieldO.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

               player2.setNickName(nameTextFieldO.getText());

            }});
		panel.add(nameTextFieldO);
		
		JLabel nameLabelO = new JLabel("Ingrese su nombre:");
		nameLabelO.setBounds(627, 310, 128, 14);
		panel.add(nameLabelO);
		
		iconoP2 = new JLabel("");
		iconoP2.setIcon(player2.getAvatar());
		iconoP2.setBounds(646, 118, 128, 128);
		panel.add(iconoP2);
		
		JLabel TitleLabel = new JLabel("X / O");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TitleLabel.setBounds(340, 11, 109, 67);
		panel.add(TitleLabel);
		
		playButton = new JButton("Play!");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonPlay();
			}
		});
		playButton.setBounds(347, 527, 89, 23);
		panel.add(playButton);
		
		JButton searchIconX = new JButton("Cambiar avatar");
		searchIconX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iconoP1.setIcon(buscarIconoPlayer(player1, pathIconX));
				
				}
			}
		);
		searchIconX.setBounds(10, 253, 128, 20);
		panel.add(searchIconX);
		
		JButton searchIconO = new JButton("Cambiar avatar");
		searchIconO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iconoP2.setIcon(buscarIconoPlayer(player2, pathIconO));
				}
		});
		searchIconO.setBounds(646, 254, 128, 20);
		panel.add(searchIconO);
		
		lblNewLabel = new JLabel("(Presione ENTER para confirmar)");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(10, 366, 212, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("(Presione ENTER para confirmar)");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(585, 366, 199, 14);
		panel.add(lblNewLabel_1);
	}
	
	private Icon buscarIconoPlayer(Player player, String pathIcon) {
		JFileChooser jf = new JFileChooser();
		jf.showOpenDialog(frame);
		File icon = jf.getSelectedFile();
		if (icon != null) {
			try {
			pathIcon = icon.getAbsolutePath();
			player.setAvatar(herramientas.CargarImagenes.cargarIcon(pathIcon, anchoIcon, altoIcon));
			}catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Seleccione un archivo con formato:\n.png, .jpeg, .jpg, .gif u otro formato de imagen");
			}
		}
		return player.getAvatar();
	}
	
	private void setPanel(JPanel panel) {
		this.panel.getParent().add(panel);
	}
	
	private void botonPlay() {
		setPanel(new MainView(player1, player2).getPanel());   
		this.panel.setVisible(false);
	}
	
	public JPanel getPanel() {
		return panel;
	}

}