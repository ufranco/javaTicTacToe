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
<<<<<<< HEAD
	private MainView mv;
	JPanel panel;
=======

>>>>>>> 24f2ba6bde00cdfbfd976c90a275910645aa3c8d
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
<<<<<<< HEAD
	
=======

>>>>>>> 24f2ba6bde00cdfbfd976c90a275910645aa3c8d
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
<<<<<<< HEAD
		mv = new MainView();
		//mv.getFrame().setEnabled(false);
=======
>>>>>>> 24f2ba6bde00cdfbfd976c90a275910645aa3c8d
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
<<<<<<< HEAD
		panel = new JPanel();
=======
		JPanel panel = new JPanel();
>>>>>>> 24f2ba6bde00cdfbfd976c90a275910645aa3c8d
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 191, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
<<<<<<< HEAD
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
=======
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panel, popupMenu);
		popupMenu.setBounds(-31, 0, 47, 69);
		
		JMenu mnNewMenu = new JMenu("New menu");
		popupMenu.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		mnNewMenu.add(chckbxmntmNewCheckItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		mnNewMenu.add(rdbtnmntmNewRadioItem);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(63, 77, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(63, 270, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(67, 462, 46, 14);
		panel.add(lblNewLabel_2);
>>>>>>> 24f2ba6bde00cdfbfd976c90a275910645aa3c8d
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(190, 0, 584, 561);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
<<<<<<< HEAD
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
=======
		JLabel lblNewLabel_3 = new JLabel("TicTacToe");
		lblNewLabel_3.setForeground(new Color(153, 0, 51));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", lblNewLabel_3.getFont().getStyle() | Font.BOLD | Font.ITALIC, lblNewLabel_3.getFont().getSize() + 5));
		lblNewLabel_3.setBounds(234, 113, 142, 22);
		panel_1.add(lblNewLabel_3);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(119, 91, -72, 92);
		panel_1.add(horizontalBox);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
>>>>>>> 24f2ba6bde00cdfbfd976c90a275910645aa3c8d
	}
}
