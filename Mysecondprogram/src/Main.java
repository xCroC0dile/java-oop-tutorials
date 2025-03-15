import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random =new Random();
		double x,y,z;
		x=scanner.nextDouble();
		y=scanner.nextDouble();
		z= Math.sqrt(x*x+y*y);
		System.out.println("hypotenuse is "+z);
		int f=random.nextInt(5);
		System.out.println("random number is "+f);

	}

}
