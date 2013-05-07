import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrame demo");
		Panel panel = new Panel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(320,240);
		frame.setVisible(true);
	}
}
