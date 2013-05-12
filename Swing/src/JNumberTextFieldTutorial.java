import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JNumberTextFieldTutorial {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JNumberTextField num = new JNumberTextField();
				num.setColumns(15);
				num.setFormat(JNumberTextField.DECIMAL);
				num.setMaxLength(7);
				num.setPrecision(4);
				num.setAllowNegative(true);
				
				JFrame frame = new JFrame();
				frame.add(num);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}

}
