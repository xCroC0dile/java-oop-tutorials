package vac;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  int number=scanner.nextInt();
  System.out.println("how many steps you want to walk?");
  step(number);
  scanner.close();
	}
static void step(int number) {
int i = 0;
if(i<number) {
i++;
System.out.println("you walked "+ i);
step(number);
}
else {
System.out.println("you finished walking");
}
}
}