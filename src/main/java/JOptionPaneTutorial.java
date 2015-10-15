import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneTutorial {
	JFrame frame = new JFrame("JOptionPane demo");
	JPanel panel = new JPanel();
	JButton button = new JButton("Call dialog");
	JTextArea textarea = new JTextArea(10, 10);

	public JOptionPaneTutorial() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(null, new
				// JScrollPane(textarea),
				// "Message dialog", JOptionPane.PLAIN_MESSAGE);

				 String title = JOptionPane.showInputDialog(null,
				 "Enter title for JFrame:");
				 frame.setTitle(title);

				// int result = JOptionPane.showConfirmDialog(null,
				// "Are you sure you want to close a JFrame",
				// "Select an option", JOptionPane.OK_CANCEL_OPTION);
				//
				// if (result == JOptionPane.OK_OPTION) {
				// frame.dispose();
				// }
			}
		});
		panel.add(button);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// frame.setBounds(100, 100, 790, 400);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JOptionPaneTutorial();
			}
		});
	}

}
