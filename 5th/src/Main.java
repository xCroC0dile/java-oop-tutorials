import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int[] T=new int[50];
	int n;
	n=scanner.nextInt();
	scanner.nextLine();
	for(int i=1;i<=n;i++) {
	T[i]=scanner.nextInt();
	}
	for (int i=1;i<=n;i++) {
	System.out.print(T[i]+" ");
	}

	}

}
