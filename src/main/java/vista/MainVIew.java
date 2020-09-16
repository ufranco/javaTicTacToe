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

public class MainVIew {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainVIew window = new MainVIew();
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
	public MainVIew() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\notab\\Pictures\\8ZWSv34j_400x400.png"));
		frame.setTitle("totally not a virus.exe");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btn1 = new JButton("");
		btn1.setFont(new Font("Arial", Font.BOLD, 24));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.getText().isEmpty()) {
					btn1.setText("O");
				}
			}
		});
		
		btn1.setBounds(291, 170, 64, 64);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Arial", Font.BOLD, 24));
		btn2.setBounds(365, 170, 64, 64);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Arial", Font.BOLD, 24));
		btn3.setBounds(439, 170, 64, 64);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Arial", Font.BOLD, 24));
		btn4.setBounds(291, 245, 64, 64);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Arial", Font.BOLD, 24));
		btn5.setBounds(365, 245, 64, 64);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Arial", Font.BOLD, 24));
		btn6.setBounds(439, 245, 64, 64);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Arial", Font.BOLD, 24));
		btn7.setBounds(439, 320, 64, 64);
		frame.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Arial", Font.BOLD, 24));
		btn9.setBounds(291, 320, 64, 64);
		frame.getContentPane().add(btn9);
		
		JButton btn10 = new JButton("");
		btn10.setFont(new Font("Arial", Font.BOLD, 24));
		btn10.setBounds(365, 320, 64, 64);
		frame.getContentPane().add(btn10);
		
		JLabel lblNewLabel_1 = new JLabel("Playing...");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(298, 45, 205, 71);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
