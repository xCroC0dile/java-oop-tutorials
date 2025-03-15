package vac5;
import java.util.Scanner;
public class Main {
static int fct(int n) {
if(n>0) {
return n*fct(n-1);

}
else {
return 1;
}
}
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("type a number");
int n=scanner.nextInt();
fct(n);
System.out.println("the factorial of "+n+" is: "+fct(n));
scanner.close();
	}

}
