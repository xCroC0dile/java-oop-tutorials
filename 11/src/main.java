import java.util.Scanner;
public class main {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String name=scanner.nextLine();
    int age=scanner.nextInt();
    double weight=scanner.nextDouble();
    human human=new human(name,age,weight);
 System.out.println("your name is "+ human.name);
 System.out.println("your age is "+ human.age);  
 System.out.println("your weight is "+ human.weight);  

}
}