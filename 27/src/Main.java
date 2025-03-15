import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
     vehicle vehicle;
     System.out.println("please choose");
     System.out.println("1-BOAT");
     System.out.println("2-CAR");
     int choice=scanner.nextInt();
     if(choice==1) {
     vehicle=new boat();
     vehicle.go();
     }
     else if(choice==2) {
    	vehicle=new car();
    	vehicle.go();
     }
     else {
    	 System.out.println("please enter a valid choice");
     }
     scanner.close();
	}

}
