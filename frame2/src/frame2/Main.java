package frame2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame frame =new JFrame();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLocationRelativeTo(null);
     
     JPanel pan=new JPanel();
     frame.add(pan,BorderLayout.NORTH);
     frame.setSize(400,400);
     pan.setBackground(Color.cyan);
     pan.setBorder(BorderFactory.createTitledBorder("information"));
     JLabel label =new JLabel();
	}

}
