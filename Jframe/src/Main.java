import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {

	public static void main(String[] args) {
	JFrame frame = new JFrame();
	JLabel label=new JLabel();
	label.setText("shit");
	label.setVerticalTextPosition(JLabel.BOTTOM);
	frame.setVisible(true);
	frame.setSize(420,420);
	frame.setTitle("hello");
	frame.setResizable(false);
	frame.getContentPane().setBackground(new Color(5,128,255));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(label);
	int k = 0;
	for(int i=1;i<5;i++) {
	
	k+=1;
	System.out.println(k);
	}
	
      
	}

}
