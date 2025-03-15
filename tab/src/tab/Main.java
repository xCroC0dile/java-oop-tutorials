package tab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int i;
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    scanner.nextLine();
    int T[]=new int[n];
    for(i=1;i<=n;i++) {
    T[i]=scanner.nextInt();
    scanner.nextLine();
    }
    for(i=1;i<=T.length;i++) {
    System.out.print(T[i]);
    }
	}

}
