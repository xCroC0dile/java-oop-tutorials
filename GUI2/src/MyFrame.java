import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MyFrame extends JFrame{
MyFrame(){
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(420,420);
	this.setTitle("hello");
	this.setResizable(false);
	ImageIcon image=new ImageIcon("2048px-User_icon_2.svg.png");
    this.setIconImage(image.getImage());
    
    this.getContentPane().setBackground(new Color(55,0,55));
	
}

}
