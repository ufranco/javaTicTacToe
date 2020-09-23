package herramientas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CargarImagenes {

	
	public static BufferedImage cargarBuffIm(String path) {
		BufferedImage hoja = null;
		try {
			hoja = ImageIO.read(new File(path));
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		return hoja;	
	}
	
//	public static Image ()
	
	
	
	
}
