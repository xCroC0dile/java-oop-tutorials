import java.util.Scanner;
public class Main {
   
   static void hello(String n) {
	
	System.out.println("hello "+ n);   
   }
	
	
	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("what is your name");
	String name=scanner.nextLine();
    
   hello(name);
	}

}
