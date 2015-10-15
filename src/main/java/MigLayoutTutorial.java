import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class MigLayoutTutorial {
	JFrame frame = new JFrame("Employees");
	JPanel panel = new JPanel();

	JLabel lblFirstName = new JLabel("First name:");
	JLabel lblLastName = new JLabel("Last name:");
	JTextField txtFirstName = new JTextField(20);
	JTextField txtLastName = new JTextField(20);
	JButton btnCreate = new JButton("Create");
	JButton btnDelete = new JButton("Delete");
	JLabel lblDsc = new JLabel("Description:");
	JTextArea txaDsc = new JTextArea(10, 10);

	public MigLayoutTutorial() {
		panel.setLayout(new MigLayout());
		panel.add(lblFirstName);
		panel.add(txtFirstName, "wrap, pushx, growx");
		panel.add(lblLastName);
		panel.add(txtLastName, "wrap, pushx, growx");
		panel.add(btnCreate, "skip, split2");
		panel.add(btnDelete, "wrap");
		panel.add(lblDsc, "top");
		panel.add(new JScrollPane(txaDsc), "push, grow");

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MigLayoutTutorial();
			}
		});
	}

}
