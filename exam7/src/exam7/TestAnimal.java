package exam7;

public class TestAnimal {
public static void main(String[] args) {
	Chat chat=new Chat("wisso");
	Chien chien=new Chien("snopie");
	System.out.print(chat.getName()+" ");
	chat.action();
	System.out.print(chien.getName()+" ");
	chien.action();
	
}
}
