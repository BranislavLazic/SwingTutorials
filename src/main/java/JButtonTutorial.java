import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JButtonTutorial {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				JButton button = new JButton("Accept");
				frame.add(button);
				/*
				 * By calling setIcon method you are setting com on JButton by
				 * passing ImageIcon instance
				 */
				button.setIcon(new ImageIcon(getClass().getResource(
                        "com/icon/Accept.png")));

				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
