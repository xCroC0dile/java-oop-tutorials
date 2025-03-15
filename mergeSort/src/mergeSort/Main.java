package mergeSort;

import java.util.Scanner;

public class Main {
	static void mergeSort(int T[],int start, int end) {
	if(start<end) {
		int mid=(start+end)/2;
		mergeSort(T, start,end) ;
		mergeSort(T, start+1, end) ;
		merge(T,start,mid,end) ;

	}
	}
static void merge(int A[],int start,int mid,int end) {
int tmp[]=new int[10];
int i=1;
int i1=start;
int i2=mid+1;
while((i1<=mid)&&(i2<=end)) {
	if(A[i1]<A[i2]) {
		tmp[i]=A[i1];
		i1=i1++;
	}
	else {
		tmp[i]=A[i2];
		i2=i2++;
	}
	i++;
	
}
while(i1<=mid) {
	tmp[i]=A[i1];
	i++;
	i1++;
}
while(i2<=end) {
tmp[i]=A[i2];
i++;
i2++;
}
A=tmp;
}
	public static void main(String[] args) {
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("what is the lenght of the array?");
		  int n=scanner.nextInt();
		  int T[]=new int[n+1];
		  scanner.nextLine();
		  for(int i=1;i<=n;i++) {
			  System.out.println((i)+": element of the array");
			 T[i]=scanner.nextInt();
			 scanner.nextLine();
			 
		  }
		  mergeSort(T,1,5);
		  System.out.println("Sorted array");
		  for(int i=1;i<=n;i++) { 
			  
			  System.out.print(T[i]+" ");
		  }
		  scanner.close();
			}

	}


