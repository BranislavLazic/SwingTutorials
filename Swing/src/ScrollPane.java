import javax.swing.*;

public class ScrollPane extends JFrame{
	JLabel label = new JLabel();
	JScrollPane scrollPane = new JScrollPane();
	
	public ScrollPane(){
		label.setIcon(new ImageIcon("C:/Documents and Settings/All Users/Documents/My Pictures/Sample Pictures/Image.jpg"));
		scrollPane.setViewportView(label);
		add(scrollPane);
	}
	
	public static void main(String[] args) {
		ScrollPane sp = new ScrollPane();
		sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//sp.setSize(1024,800);
		sp.pack();
		sp.setVisible(true);
	}

}
