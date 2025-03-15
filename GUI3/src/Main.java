import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JLabel label=new JLabel();
		ImageIcon image=new ImageIcon("bolon.png");
		frame.setVisible(true);
		frame.setSize(1920,1080);
		label.setText("henlo!");
		frame.setResizable(false);
		frame.add(label);
		frame.setIconImage(image.getImage());
		label.setIcon(image);
        
	}

}
