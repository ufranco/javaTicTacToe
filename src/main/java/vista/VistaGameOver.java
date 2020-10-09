package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VistaGameOver {

	private JPanel panel;
	private Player ganador; 
	private Player perdedor;


	public VistaGameOver(Player ganador, Player perdedor) {
		initialize(ganador, perdedor);
	}
	
	private void initialize(Player winner, Player losser) {
	
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 784, 561);
		panel.setLayout(null);
		
		initPlayers(winner, losser);
		initLayout();
	}
	
	private void initPlayers(Player winner, Player losser) {
		this.ganador = winner;
		this.perdedor = losser;
	}
	
	private void initLayout() {

		setLabels();
		setIcons();
		setNicks();
		setButtons();
		
	}

	
	private void setButtons() {
		JButton menuPpalBtn = new JButton("Menu Principal");
		menuPpalBtn.setBackground(new Color(0, 102, 255));
		menuPpalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volverAMenu();
			}});
		menuPpalBtn.setBounds(105, 463, 204, 43);
		panel.add(menuPpalBtn);
		
		JButton volverAJugarBtn = new JButton("Volver a jugar");
		volverAJugarBtn.setBackground(new Color(0, 102, 255));
		volverAJugarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				volverAJugar();
			}});
		volverAJugarBtn.setBounds(460, 463, 204, 43);
		panel.add(volverAJugarBtn);
	}
	
	private void setNicks() {

		JLabel nickGanador = new JLabel(ganador.getNickName());
		nickGanador.setForeground(new Color(210, 105, 30));
		nickGanador.setHorizontalAlignment(SwingConstants.CENTER);
		nickGanador.setBounds(89, 228, 118, 25);
		panel.add(nickGanador);
		
		JLabel nickPerdedor = new JLabel(perdedor.getNickName());
		nickPerdedor.setForeground(new Color(210, 105, 30));
		nickPerdedor.setHorizontalAlignment(SwingConstants.CENTER);
		nickPerdedor.setBounds(570, 233, 118, 25);
		panel.add(nickPerdedor);

		
	}
	
	private void setLabels() {
		JLabel ganadorLabel = new JLabel("Ganador:");
		ganadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ganadorLabel.setForeground(new Color(210, 105, 30));
		ganadorLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 28));
		ganadorLabel.setBounds(10, 22, 275, 43);
		panel.add(ganadorLabel);
		
		JLabel perdedorLabel = new JLabel("Perdedor:");
		perdedorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		perdedorLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 28));
		perdedorLabel.setForeground(new Color(210, 105, 30));
		perdedorLabel.setBounds(499, 22, 275, 43);
		panel.add(perdedorLabel);
	}
	
	private void setIcons() {
		JLabel ganadorIcon = new JLabel("");
		ganadorIcon.setIcon(ganador.getAvatar());
		ganadorIcon.setBounds(79, 89, 128, 128);
		panel.add(ganadorIcon);
		
		JLabel perdedorIcon = new JLabel("");
		perdedorIcon.setIcon(perdedor.getAvatar());
		perdedorIcon.setBounds(570, 89, 128, 128);
		panel.add(perdedorIcon);
		
	}
	
	private void volverAMenu() {
		this.panel.setVisible(false);
		this.panel.getParent().getComponent(0).setVisible(true);
		this.panel.getParent().remove(this.panel);
	}
	private void volverAJugar() {
		this.panel.setVisible(false);
		this.panel.getParent().add(new VistaJuego(perdedor, ganador).getPanel());
		this.panel.getParent().remove(this.panel);
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
}
