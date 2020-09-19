package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class FirstView {

	private JFrame frame;
	private MainView mv;
	JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstView window = new FirstView();
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
	public FirstView() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mv = new MainView();
		//mv.getFrame().setEnabled(false);
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 191, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Inicio = new JLabel("Inicio");
		Inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("#asdpersa");
				pepega();
			}
		});
		Inicio.setBounds(63, 360, 46, 14);
		panel.add(Inicio);
		
		JLabel Instrucciones = new JLabel("Instrucciones");
		Instrucciones.setBounds(63, 430, 64, 14);
		panel.add(Instrucciones);
		
		JLabel Historial = new JLabel("Historial");
		Historial.setBounds(63, 500, 46, 14);
		panel.add(Historial);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(190, 0, 584, 561);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel title = new JLabel("TicTacToe");
		title.setForeground(new Color(153, 0, 51));
		title.setFont(new Font("Franklin Gothic Medium", title.getFont().getStyle() | Font.BOLD | Font.ITALIC, title.getFont().getSize() + 5));
		title.setBounds(234, 113, 142, 22);
		panel_1.add(title);
		
	}
	void pepega() {
		mv.getFrame().setVisible(true);
		
		System.out.println("pepega");
		this.panel.setEnabled(false);
		this.frame.setVisible(false);
		this.frame.dispose();
		System.out.println("OK ?");
	}
}
