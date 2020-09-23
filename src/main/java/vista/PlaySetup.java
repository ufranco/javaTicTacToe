package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PlaySetup {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField pathTextField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public PlaySetup() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(10, 386, 147, 20);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		pathTextField = new JTextField();
		pathTextField.setBounds(10, 320, 225, 20);
		panel.add(pathTextField);
		pathTextField.setColumns(10);
		
		JButton exploreBtn = new JButton("New button");
		exploreBtn.setBounds(245, 320, 30, 20);
		panel.add(exploreBtn);
		
		JLabel nameLabel = new JLabel("Ingrese su nombre:");
		nameLabel.setBounds(10, 361, 147, 14);
		panel.add(nameLabel);
		
		JLabel pathLabel = new JLabel("Ingrese una imagen:");
		pathLabel.setBounds(10, 299, 225, 14);
		panel.add(pathLabel);
		
		JLabel iconoP1 = new JLabel("New label");
		iconoP1.setIcon(new ImageIcon("res/img/blanco.png"));
		iconoP1.setBounds(10, 118, 187, 170);
		panel.add(iconoP1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(549, 320, 225, 20);
		panel.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(509, 319, 30, 20);
		panel.add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(627, 386, 147, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese su nombre:");
		lblNewLabel_2.setBounds(627, 361, 147, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese una imagen:");
		lblNewLabel_1_1.setBounds(549, 299, 225, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel iconoP2 = new JLabel("New label");
		iconoP2.setBounds(728, 177, 46, 14);
		panel.add(iconoP2);
		
		JLabel lblNewLabel = new JLabel("Player X");
		lblNewLabel.setBounds(10, 24, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Player O");
		lblNewLabel_1.setBounds(728, 24, 46, 14);
		panel.add(lblNewLabel_1);
	}
}
