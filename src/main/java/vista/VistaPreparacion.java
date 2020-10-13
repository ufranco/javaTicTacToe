package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VistaPreparacion {
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
	private JLabel infoLabel1;
	private JLabel infoLabel2;

	public VistaPreparacion() {
		initialize();
	}

	private void initialize() {
		initPanel();
		initPlayers();
		initNameSector();
		initIconSector();
	}
	
	private void initIconSector() {
		iconoP1 = new JLabel("");
		iconoP1.setIcon(player1.getAvatar());
		iconoP1.setBounds(10, 118, 128, 128);
		panel.add(iconoP1);
		
		JButton searchIconX = new JButton("Cambiar avatar");
		searchIconX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iconoP1.setIcon(buscarIconoPlayer(player1, pathIconX));
				}});
		searchIconX.setBounds(10, 253, 128, 20);
		panel.add(searchIconX);
		
		iconoP2 = new JLabel("");
		iconoP2.setIcon(player2.getAvatar());
		iconoP2.setBounds(626, 118, 128, 128);
		panel.add(iconoP2);

		JButton searchIconO = new JButton("Cambiar avatar");
		searchIconO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iconoP2.setIcon(buscarIconoPlayer(player2, pathIconO));
				}});
		searchIconO.setBounds(626, 253, 128, 20);
		panel.add(searchIconO);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(herramientas.CargarImagenes.cargarIcon("res/img/fondo.jpg", 800, 600));
		Fondo.setBounds(0, 0, 800, 600);
		panel.add(Fondo);
	}

	private void initPanel() {
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		panel.setLayout(null);
		
		
		
		JLabel TitleLabel = new JLabel("X / O");
		TitleLabel.setForeground(Color.WHITE);
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TitleLabel.setBounds(340, 11, 109, 67);
		panel.add(TitleLabel);
		
		playButton = new JButton("Play!");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonPlay();
			}});
		playButton.setBounds(347, 527, 89, 23);
		panel.add(playButton);
		
	}
	
	

	private void initNameSector() {
		
		nameTextFieldX = new JTextField();
		nameTextFieldX.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               player1.setNickName(nameTextFieldX.getText());
            }});
		nameTextFieldX.setBounds(10, 335, 147, 20);
		panel.add(nameTextFieldX);
		
		JLabel nameLabelX = new JLabel("Ingrese su nombre:");
		nameLabelX.setForeground(Color.WHITE);
		nameLabelX.setBounds(10, 310, 128, 14);
		panel.add(nameLabelX);
		
		nameTextFieldO = new JTextField();
		nameTextFieldO.setColumns(10);
		nameTextFieldO.setBounds(607, 335, 147, 20);
		nameTextFieldO.addActionListener(new ActionListener(){
		
            public void actionPerformed(ActionEvent e){

               player2.setNickName(nameTextFieldO.getText());

            }});
		panel.add(nameTextFieldO);
		
		JLabel nameLabelO = new JLabel("Ingrese su nombre:");
		nameLabelO.setForeground(Color.WHITE);
		nameLabelO.setBounds(607, 310, 128, 14);
		panel.add(nameLabelO);
		
		infoLabel1 = new JLabel("(Presione ENTER para confirmar)");
		infoLabel1.setForeground(Color.LIGHT_GRAY);
		infoLabel1.setBounds(10, 366, 212, 14);
		panel.add(infoLabel1);
		
		infoLabel2 = new JLabel("(Presione ENTER para confirmar)");
		infoLabel2.setForeground(Color.LIGHT_GRAY);
		infoLabel2.setBounds(585, 366, 199, 14);
		panel.add(infoLabel2);
	}

	private void initPlayers() {
		pathIconX = "res/img/blanco.png";
		player1 = new Player();
		player1.setNickName("player 1");
		player1.setAvatar(herramientas.CargarImagenes.cargarIcon(pathIconX, anchoIcon, altoIcon));
		player1.setPlayerSignature(PlayerEnums.X);
		
		pathIconO = "res/img/negro.png";
		player2 = new Player();
		player2.setNickName("player 2");
		player2.setAvatar(herramientas.CargarImagenes.cargarIcon(pathIconO, anchoIcon, altoIcon));
		player2.setPlayerSignature(PlayerEnums.O);
	}

	private Icon buscarIconoPlayer(Player player, String pathIcon) {
		JFileChooser jf = new JFileChooser();
		jf.showOpenDialog(panel);
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
		this.panel.setVisible(false);
		this.panel.getParent().remove(this.panel);
	}
	
	private void botonPlay() {
		setPanel(new VistaJuego(player1, player2).getPanel());   
	}
	
	public JPanel getPanel() {
		return panel;
	}
}