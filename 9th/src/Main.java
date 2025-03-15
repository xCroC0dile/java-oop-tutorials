import java.util.Scanner;
public class Main {
static int Double(int x){
int z;
z=x*x;
return z;	
	
}	
public static void main(String[] args) {	
System.out.println("type a number");
Scanner scanner=new Scanner(System.in);
int x=scanner.nextInt();	

System.out.println(Double(x));	
	
}
}