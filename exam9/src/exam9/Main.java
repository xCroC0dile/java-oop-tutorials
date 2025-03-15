package exam9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("1:cat   2:dog");
    Animal animal;
    int x=scanner.nextInt();
    if(x==1) {
    animal=new Cat();
    animal.speak();
    }
    else if(x==2){
    animal=new Dog();
    animal.speak();
    }
    else {
    animal=new Animal();
    animal.speak();
    }
    
	}

}
