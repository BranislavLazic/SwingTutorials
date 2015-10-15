package com.event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextFieldEvent {

	JFrame frame = new JFrame("JTextField demo");
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField("", 20);
	JButton button = new JButton("Ok");

	public TextFieldEvent() {
		textfield.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				warn();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				warn();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				warn();
			}
			
			public void warn(){
				button.setText(textfield.getText());
			}
		});
		panel.add(textfield);
		panel.add(button);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TextFieldEvent();
			}
		});
	}

}
