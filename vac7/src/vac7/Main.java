package vac7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
      int T[] =new int[5];
      System.out.println("what is the size of the array?");
      int n=scanner.nextInt();
      scanner.nextLine();
      
      for(int i=0;i<n;i++) {
    	  System.out.println((i+1)+" element of array");
    	 T[i]=scanner.nextInt();
    	 scanner.nextLine();
      }
      for(int i=0;i<n-1;i++) {
    	  for(int j=0;j<n-i-1;j++) {
    		  if(T[j]>T[j+1]) {
    			  int temp = T[j+1];
    			  T[j+1]=T[j];
    			  T[j]=temp;
    		  }
    	  }
      }
      for(int i=0;i<n;i++) {
    	  System.out.print(T[i]+" ");
      }
      scanner.close();
	}

}
