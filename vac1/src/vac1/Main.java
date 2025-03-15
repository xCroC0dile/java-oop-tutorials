package vac1;

import java.util.Scanner;

public class Main {
	static void hello(int n) {
	if(n>0) {
	System.out.println("hello world!"+n);
	n--;
   hello(n);
	}
	}
	public static void main(String[] args) {
  Scanner scanner =new Scanner(System.in);
  System.out.println("how many times?");
 int number=scanner.nextInt();
	hello(number);	
	}

}
