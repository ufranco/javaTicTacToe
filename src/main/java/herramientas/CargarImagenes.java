package herramientas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CargarImagenes {

	
	public static BufferedImage cargarBuffIm(String path) {
		BufferedImage hoja = null;
		try {
			hoja = ImageIO.read(new File(path));
		}catch (IOException ex) {
			JOptionPane.showInputDialog("Seleccione un archivo con formato:\n.png, .jpeg, .jpg, .gif u otro formato de imagen");
		}
		return hoja;	
	}
	
	public static ImageIcon cargarIcon(String path, int ancho, int alto) {
		
		return new ImageIcon(resize(cargarBuffIm(path), ancho, alto));
	}

	private static Image resize(BufferedImage Bimg, int ancho, int alto) {
		Image scaledImagen = Bimg.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
		return scaledImagen;
	}
	
	
	
	
	
}
