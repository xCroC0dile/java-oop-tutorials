package vac6;
import java.util.Scanner;
public class Main {
	static int fct(int n) {
		if((n==1)||(n==2)) {
		return 1;
		}
		else {
		return fct(n-1)+fct(n-2);
		}
		}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Type a number:");
		int n=scanner.nextInt();
   fct(n);
   System.out.println("fib of "+n+" is : "+fct(n));
   scanner.close();
	}

}
