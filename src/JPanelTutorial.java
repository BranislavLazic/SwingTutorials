import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JPanelTutorial extends JPanel{
	BufferedImage image;
	
	public JPanelTutorial(){
		try {
			image = ImageIO.read(new File("C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/Winter.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public void paintComponent(Graphics g){
		//g.drawImage(image, 0,0,null);
//		g.setColor(Color.RED);
//		g.fillRect(10, 10, 100, 50);
//	}
}
