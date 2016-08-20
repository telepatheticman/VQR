package Encoding;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class imageCreationtest {
	public void paint(Graphics g) throws IOException{
	//	File path = new File("\\VQR\\Images");
	//	String path = "\\VQR\\Images";
		
			BufferedImage A = ImageIO.read(new File("A.jpg"));
			BufferedImage B = ImageIO.read(new File("B.jpg"));
		
		BufferedImage AB = new BufferedImage(100, 50, BufferedImage.TYPE_INT_ARGB);
	/*	Graphics g */ AB.getGraphics();
		g.drawImage(A, 0, 0, null);
		g.drawImage(B, 50, 0, null);

		// Save as new image
		ImageIO.write(AB, "JPG", new File("AB.jpg"));
	}
	
}
