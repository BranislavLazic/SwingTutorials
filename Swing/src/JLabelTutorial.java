import javax.swing.*;

public class JLabelTutorial {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JLabel demo");
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/Water lilies.jpg"));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
