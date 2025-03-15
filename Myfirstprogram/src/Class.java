import java.util.Scanner;
import javax.swing.JOptionPane;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanf= new Scanner(System.in);
	System.out.println("What is your name?");
	String name=scanf.nextLine();
	System.out.println("what is your age ? ");
	int age=scanf.nextInt();
	System.out.println("what is ur fav food ?");
	scanf.nextLine();
	String food=scanf.nextLine();
	System.out.println("your name is "+ name);
	System.out.println("your age is "+age);
	System.out.println("your fav food is "+food);
    String name2=JOptionPane.showInputDialog("enter your name");
    
	

	}

}
