import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Branislav
 * Date: 5/19/13
 * Time: 3:56 PM
 */
public class JPasswordFieldTutorial {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPasswordField passwordField = new JPasswordField(20);
	JButton button = new JButton("Perform check");

	public JPasswordFieldTutorial() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				char [] input = passwordField.getPassword();
				if(checkIfCorrect(input)) {
					JOptionPane.showMessageDialog(null,"Password is correct!");
				} else {
					JOptionPane.showMessageDialog(null,"Password is incorrect!");
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

	private boolean checkIfCorrect(char [] input) {
		boolean isCorrect = false;
		char [] correctPass = {'1','2','3'};

		if(input.length != correctPass.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals(input, correctPass);
		}
		Arrays.fill(correctPass,'0');
		return isCorrect;
	}

	public static void main(String [] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JPasswordFieldTutorial();
			}
		});
	}
}
