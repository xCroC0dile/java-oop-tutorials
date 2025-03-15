import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Fenetre extends JFrame {
public Fenetre() {
setTitle("ma premiere fenetre java");
setSize(400,100);
setLocationRelativeTo(null);
JPanel pan=new JPanel();
pan.setBackground(Color.orange);
add(pan).setVisible(true);

}
public static void main(String[] args) {
	Fenetre fenetre=new Fenetre();
	fenetre.setVisible(true);
}
}

