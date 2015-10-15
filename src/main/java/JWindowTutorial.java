import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JWindowTutorial extends JWindow{
	JPanel panel = new JPanel();
	
	public JWindowTutorial(){
		panel.setBackground(Color.BLUE);
		add(panel);
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(e.getClickCount() == 2){
					dispose();
				}
			}
		});
	}

	public static void main(String[] args) {
		JWindowTutorial w = new JWindowTutorial();
		w.setSize(640,480);
		w.setVisible(true);
	}

}
