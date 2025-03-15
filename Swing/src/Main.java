import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
public class Main{

	public static void main(String[] args) {
      JFrame frame=new JFrame();
      JPanel panel=new JPanel();
      frame.setVisible(true);
      frame.setTitle("hello");
      frame.setSize(420,420);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      frame.add(panel);
      panel.setLayout(new BorderLayout());
      panel.add(new JButton("CENTER"), BorderLayout.NORTH);
      panel.add(new JCheckBox("SOUTH"), BorderLayout.CENTER);
      panel.add(new JRadioButton("EAST"), BorderLayout.WEST);
      
      
      
		
	}

}
