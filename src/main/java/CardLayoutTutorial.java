import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTutorial {
	JFrame frame = new JFrame("CardLayout demo");
	JPanel panelCont = new JPanel();
	JPanel panelFirst = new JPanel();
	JPanel panelSecond = new JPanel();
	JButton buttonOne = new JButton("Switch to second panel/workspace");
	JButton buttonSecond = new JButton("Switch to first panel/workspace");
	CardLayout cl = new CardLayout();

	public CardLayoutTutorial() {
		panelCont.setLayout(cl);

		panelFirst.add(buttonOne);
		panelSecond.add(buttonSecond);
		panelFirst.setBackground(Color.BLUE);
		panelSecond.setBackground(Color.GREEN);

		panelCont.add(panelFirst, "1");
		panelCont.add(panelSecond, "2");
		cl.show(panelCont, "1");
		
		buttonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "2");
			}
		});
		
		buttonSecond.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "1");
			}
		});
		
		frame.add(panelCont);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CardLayoutTutorial();
			}
		});
	}

}
