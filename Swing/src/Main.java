import javax.swing.*;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public JFrame GeckoFrame;
	private JPanel GeckoPanel;
	private JButton button1;
	private JLabel lable;

	public Main() {
		gui();
	}

	public void gui() {

		GeckoFrame = new JFrame("Znet Main");
		GeckoFrame.setVisible(true);
		GeckoFrame.setSize(1000, 700);
		GeckoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GeckoFrame.add(button1, null);
		GeckoFrame.add(lable, null);
		GeckoFrame.pack();
		GeckoPanel = new JPanel();
		GeckoFrame.add(button1, null);
		GeckoFrame.add(lable, null);
		button1 = new JButton("Test");
		button1.setVisible(true);
		lable = new JLabel("Hello");
		lable.setVisible(true);
		GeckoFrame.add(GeckoPanel);

	}

	public static void main(String[] args) {
		new Main();
	}
}