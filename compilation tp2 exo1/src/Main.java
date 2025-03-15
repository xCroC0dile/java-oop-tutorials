import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     System.out.println("donner une chaine");
     Scanner scanner= new Scanner(System.in);
     char tc,ts;
     int c=0;
     String n=scanner.nextLine();
     for(int i=0;i<n.length();i++) {
         c++;
     }
     
     if(c==4) {
    	int i=0;
     tc=n.charAt(i);
     i++;
     if(tc=='a') {
    	 
          tc=n.charAt(i);
          i++;
         if(tc=='c') {
         tc=n.charAt(i);
         i++;
            if(tc=='a') {
             tc=n.charAt(i);
             i++;
             if(tc=='b') {
            System.out.println("chaine accepter");
             }else {System.out.println("erreur");}
            }else {System.out.println("erreur");}
    	 
            } else if(tc=='a') {
                  tc=n.charAt(i);
                  i++;
                  if(tc=='c') {
                	tc=n.charAt(i);
                	i++;
                	if(tc=='a') {
                	System.out.println("chaine accepter");
                	} else {System.out.println("erreur");}
                  }else {System.out.println("erreur");}
            } else {System.out.println("erreur");}
     }
	} else { System.out.println("erreur");}

}
}