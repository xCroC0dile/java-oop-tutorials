import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
int n,m,i,j;
String [][] T = new String[50][50];
System.out.println("what is the number of rows");
n=scanner.nextInt();
scanner.nextLine();
System.out.println("what is the number of columns");
m=scanner.nextInt();
scanner.nextLine();
for(i=1;i<=n;i++) {
for(j=1;j<=m;j++) {
T[i][j]=scanner.nextLine();
}
}
for(i=1;i<=n;i++) {
System.out.println();
for(j=1;j<=m;j++) {
System.out.print(T[i][j]+" ");
}
}	
}

}
