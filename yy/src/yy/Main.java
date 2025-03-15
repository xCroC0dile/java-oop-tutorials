package yy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scanner=  scanner=new Scanner(System.in);
		System.out.println("what is your name?");
		String name=scanner.nextLine();


		System.out.println("what is your gender?");

	    System.out.println("(M/F)");
		String gender=scanner.nextLine();
		
		
		if(gender.equalsIgnoreCase("m")) {
		System.out.println("hello mr "+name);
	    }
		else if (gender.equalsIgnoreCase("f")) {
	    System.out.println("hello mrs "+name);
		}
		
	
 
        scanner.close();
}
}
