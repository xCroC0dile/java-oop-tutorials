import java.util.Scanner;
public class vac5 {
int fct(int n) {
return fct(n)*fct(n-1);

}
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("type a number");
int n=scanner.nextInt();
fct(n);

		
	}

}
