import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

public class JInternalFrameTutorial {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JDesktopPane desktopPane = new JDesktopPane();
				JInternalFrame intFrame = new JInternalFrame(
						"JInternalFrame demo");

				intFrame.setMaximizable(true);
				intFrame.setIconifiable(true);
				intFrame.setResizable(true);
				intFrame.setClosable(true);
				intFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

				intFrame.setSize(320, 240);
				// intFrame.pack();
				intFrame.setVisible(true);

				desktopPane.add(intFrame);

				JFrame frame = new JFrame();
				frame.add(desktopPane);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setSize(640, 480);
				// frame.pack();

				frame.setVisible(true);

			}
		});
	}
}
