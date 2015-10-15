import javax.swing.*;
import java.awt.*;


public class BoxLayoutTutorial {
	JFrame frame = new JFrame("BoxLayout tutorial");
	JPanel panel = new JPanel();
	JButton buttonFirst = new JButton("First");
	JButton buttonSecond = new JButton("Second");
	
	public BoxLayoutTutorial() {
		panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
		panel.add(buttonFirst);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createRigidArea(new Dimension(5,0)));
		panel.add(buttonSecond);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new BoxLayoutTutorial();
			}
		});
	}

}
