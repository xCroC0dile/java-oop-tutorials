package rand;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,answer = 0,guess,Try=0,atm=1;
 Random rand =new Random();
 Scanner scanner=new Scanner(System.in);
 n=rand.nextInt(10)+1;
System.out.println(n);
while(answer!=1) {
System.out.println(" do you wanna start?");
System.out.println("\t1.yes");
System.out.println("\t2.no");
answer=scanner.nextInt();
	}
System.out.println("guess a number between 1 and 10");
guess=scanner.nextInt();
while(Try<=5) {
	Try++;
	if(guess!=n) {
	
	System.out.print("Try again!");atm++;
	System.out.println("\tAttempt: "+Try);
	
	if(guess>n) {
		System.out.println("Hint:Guess lower.");
		
	}
	else {
		System.out.println("Hint:Guess higher.");
		
	}
	guess=scanner.nextInt();
	
	}
}
if(guess==n) {
System.out.println("Congratulations you won!");
System.out.println("Number of Attempts: "+atm);
}
else {
System.out.println("you lost");
System.out.println("Number of Attempts "+atm);
}

	}

}
