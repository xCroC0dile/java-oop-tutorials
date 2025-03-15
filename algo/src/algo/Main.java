package algo;

import java.util.Scanner;

public class Main {
	public static void Proc(int k,int i,int s,boolean bool) {
	if((i<=k) && (bool=true)){
	if((k%i)==0){
	s=s++;
	if(s<=2) {
	Proc(k,i+1,s,bool);
	}
	else {
	bool=false;
	}
	
	}
	else {
    Proc(k,i+1,s,bool);
	}
	}
	}

	public static void main(String[] args) {
	    int n,i,cpt,x,j;
	    boolean bool;
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is the size of the array?");
		n=scanner.nextInt();
		scanner.nextLine();
		int T[]=new int[n+1];
		 for(i=1;i<=n;i++) {
			 System.out.println((i)+": element of the array");
		   T[i]=scanner.nextInt();
		scanner.nextLine();
			 
		  }
		
		i=1;
		cpt=0;
		while(i<=n) {
			x=0;
			j=1;
			bool=true;
			Proc(T[i],j,x,bool);
			if(bool=true) {
			 cpt++;
			}
			else {
			i++;
			}
		
			
			scanner.close();
		}
		
	System.out.print("cpt="+cpt);
	
	}
	
}

