import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class JPasswordFieldTutorial {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPasswordField passwordField = new JPasswordField(20);
	JButton button = new JButton("Login");

	public JPasswordFieldTutorial() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				char[] input = passwordField.getPassword();
				if (performCheck(input)) {
					JOptionPane.showMessageDialog(null, "You just logged in!");
				} else {
					JOptionPane.showMessageDialog(null, "Failed to log in");
				}
			}
		});
		passwordField.setEchoChar('*');
		panel.add(passwordField);
		panel.add(button);

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private boolean performCheck(char[] input) {
		boolean isCorrect = false;
		char[] correctPass = { '1', '2', '3' };
		if (input.length != correctPass.length) {
			isCorrect = false;
		}
		if (Arrays.equals(input, correctPass)) {
			isCorrect = true;
		}
		Arrays.fill(correctPass, '0');

		return isCorrect;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JPasswordFieldTutorial();
			}
		});
	}
}
