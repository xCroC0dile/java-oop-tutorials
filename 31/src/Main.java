import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("please enter a number");
int n=scanner.nextInt();
System.out.print(n+" ");
while(n!=1) {
	
if(n%2==1) {
n=n*3+1;
System.out.print(n+" ");

}
else {
n=n/2;
System.out.print(n+" ");

}
}

}



}