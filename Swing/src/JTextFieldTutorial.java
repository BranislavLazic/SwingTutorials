import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextFieldTutorial {

	JFrame frame = new JFrame("JTextField demo");
	JTextField textfield = new JTextField("Hello from JTextField", 10);

	public JTextFieldTutorial() {
		frame.add(textfield);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JTextFieldTutorial();
			}
		});
	}

}
