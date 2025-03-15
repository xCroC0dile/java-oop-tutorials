package conj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m=1,flag=0;
for(int i=1;i<100;i++) {
for(int k=2;k<i;k++) {
	if(i%k==0) {
		flag=1;
		break;
	}
	else {
     flag=0;
	 m=i;
	}
	
	
}if(flag==0) {System.out.println(m);}
}

}
}
