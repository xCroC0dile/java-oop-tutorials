package vac2;

import java.util.Scanner;


public class Main {
	static void step(int i ,int number) {
		
		if(i<number) {
		i++;
		System.out.println("you walked "+ i);
		step(0,number);
		}
		else {
		System.out.println("you finished walking");
		}
		}

	public static void main(String[] args) {
			  Scanner scanner=new Scanner(System.in);
			  int number=scanner.nextInt();
			  System.out.println("how many steps you want to walk?");
			  step(0,number);
			  scanner.close();
				}
		
			
	}


