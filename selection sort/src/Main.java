import java.util.Scanner;

public class Main {
static void selectionSort(int T[],int n) {
	int i,j,m,tmp;
	for(i=1;i<=n-1;i++) {
		m=i;
	for(j=i+1;j<=n;j++) {
		if(T[j]<T[m]) {
		m=j;
		tmp=T[m];
		T[m]=T[i];
		T[i]=tmp;
		m=i;
	}
	}
	}
	
}
	public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  int T[]=new int[10];
  System.out.println("what is the lenght of the array?");
  int n=scanner.nextInt();
  scanner.nextLine();
  for(int i=1;i<=n;i++) {
	  System.out.println((i+1)+": element of the array");
	 T[i]=scanner.nextInt();
	 scanner.nextLine();
	 
  }
  selectionSort(T,n);
  System.out.println("Sorted array");
  for(int i=1;i<=n;i++) { 
	  
	  System.out.print(T[i]+" ");
  }
  scanner.close();
	}

}
