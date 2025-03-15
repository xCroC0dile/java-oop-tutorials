package vac4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
int[][] t=new int[3][3];
 Scanner scanner=new Scanner(System.in);
 System.out.println("how many lines?");
 int lines=scanner.nextInt();
 scanner.nextLine();
 System.out.println("how many column?");
 int column=scanner.nextInt();
 scanner.nextLine();
 for(int i=0;i<lines;i++) {
	for(int j=0;j<column;j++) {
		System.out.println("["+(i+1)+","+(j+1)+"]");
		t[i][j]=scanner.nextInt();
		scanner.nextLine();
  	}
 }
 for(int i=0;i<lines;i++) {
	 System.out.println(" ");
	for(int j=0;j<column;j++) {
		System.out.print(t[i][j]+" ");
	}
 }
 scanner.close();
	}

}
