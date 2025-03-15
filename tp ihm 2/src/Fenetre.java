import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Fenetre extends JFrame{
public Fenetre() {
setTitle("Button");
setSize(300,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setLayout(new BorderLayout());
JPanel pan=new JPanel();
add(pan);
JRadioButton b1 =new JRadioButton();
JRadioButton b2 =new JRadioButton();
ButtonGroup bg =new ButtonGroup();
bg.add(b1);
bg.add(b2);
pan.add(b1);
pan.add(b2);



}
public static void main(String[] args) {
	Fenetre fenetre=new Fenetre();
	fenetre.setVisible(true);
}

}
