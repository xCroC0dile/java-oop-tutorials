package frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main {

	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(400,400);
		frame.setTitle("revision");
	    frame.setLayout(new BorderLayout());
	    
		JPanel pan =new JPanel();
		frame.add(pan,BorderLayout.NORTH);
		pan.setBackground(Color.cyan);
		pan.setLayout(new BorderLayout());
		JCheckBox b=new JCheckBox("test");
		JRadioButton b2=new JRadioButton("test");
		JButton b3=new JButton("click");
		b2.setEnabled(false);
		b.setSelected(true);
		pan.add(b,BorderLayout.EAST);
        pan.add(b2,BorderLayout.WEST);
       
        pan.add(b3,BorderLayout.NORTH);
        b.setBackground(Color.red);
        b.setForeground(Color.white);
	}

}
