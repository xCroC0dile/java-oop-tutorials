import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int i=0;
		Scanner scanner=new Scanner(System.in);
		String n=scanner.nextLine()+"#";
		if(n.charAt(i)=='a') {
			i++;
			if(n.charAt(i)=='c') {
				i++;
				if(n.charAt(i)=='a') {
					i++;
					while(n.charAt(i)=='b') {
						i++;
					
					}
					if(n.charAt(i)=='#' && i==n.length()-1) {
						System.out.println("accepter");
					}else{
						System.out.println("err");
					}
				}else {
					System.out.println("err");
				}
			}else {
				System.out.println("err");
			}
		}else {
			System.out.println("err");
		}

	}

}
