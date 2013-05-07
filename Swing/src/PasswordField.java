import javax.swing.SwingUtilities;

public class PasswordField {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new PasswordField();
			}
		});
	}
}
