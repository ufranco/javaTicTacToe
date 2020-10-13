package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;


public class VistaInstrucciones {

	
	private JPanel panel;

	public VistaInstrucciones() {
		initialize();
	}


	private void initialize() {
		
		panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		panel.setLayout(null);
		
		JButton botonVolver = new JButton("Volver");
		botonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonVolver();
			}
		});
		botonVolver.setBounds(343, 538, 89, 23);
		panel.add(botonVolver);
		
		JLabel instrucciones = new JLabel("");
		instrucciones.setIcon(herramientas.CargarImagenes.cargarIcon("res/img/Instrucciones.png", 784, 561));
		instrucciones.setBounds(0, 0, 784, 561);
		panel.add(instrucciones);
		
	}

	public JPanel getPanel() {
		return this.panel;
	}
	
	private void botonVolver() {
		this.panel.getParent().getComponent(0).setVisible(true);
		this.panel.setVisible(false);
		this.panel.getParent().remove(this.panel);
	}

}
