import javax.swing.*;
import java.awt.*;


public class FlowLayoutTutorial {
	JFrame frame = new JFrame("FlowLayout demo");
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("First");
	JButton btn2 = new JButton("Second");
	JButton btn3 = new JButton("Third");
	
	public FlowLayoutTutorial() {
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT,3,3));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FlowLayoutTutorial();
			}
		});
	}

}
