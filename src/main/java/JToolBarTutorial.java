import javax.swing.*;
import java.awt.*;

public class JToolBarTutorial {
	JFrame frame = new JFrame();
	JTextField textField = new JTextField(15);
	JButton btnAdd = new JButton("Add");
	JButton btnDelete = new JButton("Delete");
	JToolBar toolBar = new JToolBar();

	public JToolBarTutorial() {
	  	toolBar.add(textField);
		toolBar.add(btnAdd);
		toolBar.addSeparator();
		toolBar.add(btnDelete);
		toolBar.setFloatable(false);
		frame.add(toolBar, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JToolBarTutorial();
			}
		});
	}
}
