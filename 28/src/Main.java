import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
 try {
	Scanner scanner =new Scanner(System.in);
      System.out.println("please enter a number");
      double x=scanner.nextInt();
      System.out.println("please enter another number");
      double y=scanner.nextInt();
      System.out.println("devision");
      double z=x/y;
      System.out.printf("%.2f", z);
 }
 catch(InputMismatchException e) {
System.out.println("something went wrong");
 }
	

}
}
