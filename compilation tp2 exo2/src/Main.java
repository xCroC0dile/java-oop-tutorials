import java.util.Scanner;

public class Main {
	
public int colonne(char c){
if(c=='"') {
return 0;
}
else {
if(('a'<=c) && (c<='z')){
return 1;	
}else {
if(('0'<=c)&&(c<='9')){
return 1;
}

}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int m[][]= {{1,-1,-1,-1},{2,1,1,1},{-1,-1,-1,-1}};
String mot=scanner.nextLine();
char tc;
int ec=0,i=0;
tc=mot.charAt(i);
while((tc!='#')&&(m[ec][tc]!=-1)) {
ec=m[ec][tc];
tc=mot.charAt(i+1);
}


}

}


