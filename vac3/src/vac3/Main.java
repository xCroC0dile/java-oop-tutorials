package vac3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How far do you want to walk (meters)?: ");
		int distance = scan.nextInt();
		
		takeAStep(0,distance);
		scan.close();
		
	}
	
	static void takeAStep(int i,int distance) {
		
		if(i<distance) {
			i++;
			System.out.println("*you take a step* : "+i+" meter/s");
			takeAStep(i,distance);
		}
		else {
			System.out.println("You are done walking!");
		}

	}
	

	}

