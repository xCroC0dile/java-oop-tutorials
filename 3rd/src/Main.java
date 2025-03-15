
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner= new Scanner(System.in);
	System.out.println("what is your name");
    String name=scanner.nextLine();
    System.out.println("what is your last name");
    String lname=scanner.nextLine();
    System.out.println("what is your age ?");
    int age=scanner.nextInt();
    System.out.println("what is your height?");
    double height=scanner.nextDouble();
    System.out.println("your name is "+name+" your last name is "+lname+ " your age is "+age+ " your height is " + height);
	

	}

}
