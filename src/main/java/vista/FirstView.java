package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstView {

	private JFrame frame;
	private PlaySetup ps;
	JPanel Canvas;
	
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

	public FirstView() {
		initialize();
	}
	
	private void initialize() {
		initFrame();
		initCanvas();
		initMenu();
		initTitleDisplay();
	}
	
	private void initTitleDisplay() {
		JPanel DisplayIni = new JPanel();
		DisplayIni.setBackground(new Color(0, 0, 102));
		DisplayIni.setBounds(190, 0, 594, 561);
		DisplayIni.setLayout(null);
		Canvas.add(DisplayIni);
		
		JLabel title = new JLabel();
		title.setIcon(new ImageIcon("res/img/Tateti.gif"));
		title.setForeground(new Color(153, 0, 51));
		title.setBounds(59, 35, 480, 480);
		DisplayIni.add(title);
	}

	private void initMenu() {
		JPanel leftMenu = new JPanel();
		leftMenu.setBackground(new Color(0, 102, 255));
		leftMenu.setBounds(0, 0, 191, 561);
		leftMenu.setLayout(null);
		Canvas.add(leftMenu);
		
		JLabel Inicio = new JLabel("");
		Inicio.setIcon(herramientas.CargarImagenes.cargarIcon("res/img/play.png", 64,64));
		Inicio.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				botonInicio();
				
			}});
		
		Inicio.setBounds(50, 189, 64, 64);
		leftMenu.add(Inicio); 
		
		JLabel Instrucciones = new JLabel("");
		Instrucciones.setIcon(herramientas.CargarImagenes.cargarIcon("res/img/info.png", 64,64));
		Instrucciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				botonInstrucciones();
			}
		});
		Instrucciones.setBounds(50, 328, 64, 64);
		leftMenu.add(Instrucciones);
	}

	private void initCanvas() {
	    Canvas = new JPanel();
		Canvas.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(Canvas);
		Canvas.setLayout(null);
	}

	private void initFrame() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("res/img/favicon.png"));
		frame.setTitle("totally not a virus.exe");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
	}

	private void setPanel(JPanel panel) {
		this.frame.getContentPane().add(panel);
	}
	void botonInicio() {
		ps = new PlaySetup();
		this.setPanel(ps.getPanel());    
		this.Canvas.setVisible(false);
	}
	private void botonInstrucciones() {
		Instrucciones inst = new Instrucciones();
		this.setPanel(inst.getPanel());
		this.Canvas.setVisible(false);
	}
}

