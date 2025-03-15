package frame3;

import javax.swing.*;
import java.awt.*;
public class Fenetre extends JFrame{
	private JPanel container = new JPanel();
	private JComboBox combo = new JComboBox();
	private JLabel label = new JLabel("Une ComboBox");
	public Fenetre(){
setSize(300,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
JPanel top=new JPanel();
top.setBackground(Color.white);
add(top,BorderLayout.NORTH);
combo.setPreferredSize(new dimension());
	}
public static void main(String[] args) {
	Fenetre f=new Fenetre();
	f.setVisible(true);
	f.setSize(400,400);
}
}