import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderTutorial {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,255,0);

	public JSliderTutorial() {
		label.setOpaque(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
			  	JSlider source = (JSlider) e.getSource();
				label.setBackground(new Color(0,0,source.getValue()));
			}
		});
		frame.add(label, BorderLayout.CENTER);
		frame.add(slider,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JSliderTutorial();
			}
		});
	}
}
