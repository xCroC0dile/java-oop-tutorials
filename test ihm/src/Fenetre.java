import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Fenetre extends JFrame{
public Fenetre() {
setTitle("yassine,khettari,b4");
setSize(700,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setLayout(new BorderLayout());
JPanel pan =new JPanel();
JPanel pan2 =new JPanel();
JPanel pan3 =new JPanel();
JPanel pan2_1 =new JPanel();
JPanel pan2_2 =new JPanel();
JPanel pan2_3 =new JPanel();
JLabel label=new JLabel("Nom de l'etudiant                             ");
JLabel label2=new JLabel("Prenom de l'etudiant");
JLabel label3=new JLabel("Nom:");
JLabel label4=new JLabel("Prenom:");

ImageIcon icon=ImageIcon(getClass().getResource("image/Capture2.PNG"));
JLabel image=new JLabel(icon);
pan.add(image);
add(pan,BorderLayout.EAST);

add(pan2,BorderLayout.CENTER);
add(pan3,BorderLayout.SOUTH);

pan2.setLayout(new BorderLayout());
pan2.add(pan2_1,BorderLayout.NORTH);
pan2.add(pan2_2,BorderLayout.CENTER);
pan2.add(pan2_3,BorderLayout.SOUTH);
pan2_1.add(label);
pan2_1.add(label2);
pan2_2.add(label3);JTextField textf=new JTextField(10);pan2_2.add(textf);

pan2_2.add(label4);JTextField textf2=new JTextField(10);pan2_2.add(textf2);
JLabel label5=new JLabel("information");
JCheckBox check=new JCheckBox("informatique");
JCheckBox check2=new JCheckBox("MI");
JButton button=new JButton("ok");
JButton button2=new JButton("Annuler");
pan3.add(button);
pan3.add(button2);
button.setSize(new Dimension(20,10));
button2.setSize(new Dimension(20,10));
pan2_3.add(label5);
pan2_3.add(check);pan2_3.add(check2);
check.setSelected(true);
check2.setSelected(true);

button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
	JOptionPane.showMessageDialog(null,"Information saisies");
			
}});
;





}
private ImageIcon ImageIcon(String string) {
	// TODO Auto-generated method stub
	return null;
}
public static void main(String[] args) {
Fenetre f=new Fenetre();
f.setVisible(true);

}
}
