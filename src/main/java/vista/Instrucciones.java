package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Instrucciones {

	private JFrame frame;
	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucciones window = new Instrucciones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Instrucciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton botonVolver = new JButton("Volver");
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonVolver();
			}
		});
		botonVolver.setBounds(343, 538, 89, 23);
		panel.add(botonVolver);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(herramientas.CargarImagenes.cargarIcon("res/img/Instrucciones.png", 784, 561));
		lblNewLabel.setBounds(0, 0, 784, 561);
		panel.add(lblNewLabel);
		
	}

	public JPanel getPanel() {
		return this.panel;
	}
	
	private void botonVolver() {
		this.panel.getParent().getComponent(0).setVisible(true);;
		this.panel.setVisible(false);
	}

}
