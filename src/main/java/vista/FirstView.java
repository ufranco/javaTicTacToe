package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FirstView {

	private JFrame frame;
	private MainView mv;
	JPanel Canvas;
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
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("res/img/favicon.png"));
		frame.setTitle("totally not a virus.exe");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    Canvas = new JPanel();
		Canvas.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(Canvas);
		Canvas.setLayout(null);
		
		
		JPanel leftMenu = new JPanel();
		leftMenu.setBackground(new Color(0, 102, 255));
		leftMenu.setBounds(0, 0, 191, 561);
		leftMenu.setLayout(null);
		Canvas.add(leftMenu);
		
		JLabel Inicio = new JLabel("Inicio");
		Inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				botonInicio();
			}
		});
		Inicio.setBounds(63, 360, 46, 14);
		leftMenu.add(Inicio);
		
		JLabel Instrucciones = new JLabel("Instrucciones");
		Instrucciones.setBounds(63, 430, 64, 14);
		leftMenu.add(Instrucciones);
		
		JLabel Historial = new JLabel("Historial");
		Historial.setBounds(63, 500, 46, 14);
		leftMenu.add(Historial);
		
		JPanel DisplayIni = new JPanel();
		DisplayIni.setBackground(new Color(0, 0, 102));
		DisplayIni.setBounds(190, 0, 594, 561);
		DisplayIni.setLayout(null);
		Canvas.add(DisplayIni);
		
		JLabel title = new JLabel();
		title.setIcon(new ImageIcon("res/img/Tateti.gif"));
		title.setForeground(new Color(153, 0, 51));
		title.setFont(new Font("Franklin Gothic Medium", title.getFont().getStyle() | Font.BOLD | Font.ITALIC, title.getFont().getSize() + 5));
		title.setBounds(59, 35, 480, 480);
		DisplayIni.add(title);
		
	}
	
	private void setPanel(JPanel panel) {
		this.frame.getContentPane().add(panel);
	}
	void botonInicio() {
		this.setPanel(mv.getPanel());    
		this.Canvas.setVisible(false);
	}
}

