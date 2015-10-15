import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingScreenDemo extends JWindow {
	private static final long serialVersionUID = 1L;

	JPanel panel = new JPanel();
	JProgressBar progressBar = new JProgressBar();

	public LoadingScreenDemo() {
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new BorderLayout());
		panel.add(progressBar, BorderLayout.SOUTH);
		panel.setFocusable(true);
		progressBar.setStringPainted(true);
		add(panel);

		Timer timer = new Timer(100, new ActionListener() {
			int i = 0;

			public void actionPerformed(ActionEvent evt) {
				progressBar.setValue(i);
				i++;
				panel.repaint();
				if (i == 100) {
					((Timer) evt.getSource()).stop();
					dispose();
				}
			}
		});
		timer.start();
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoadingScreenDemo w = new LoadingScreenDemo();
				w.setSize(640, 480);
				w.setLocationRelativeTo(null);
				w.setVisible(true);
			}
		});

	}
}
