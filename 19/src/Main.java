
public class Main {

	public static void main(String[] args) {
	 Food food1=new Food("pizza");
     Food food2=new Food("bread");
     Food food3=new Food("fries");
	Food food[]=new Food[3];
	food[0]=food1;
	food[1]=food2;
	food[2]=food3;
	for(int i=0;i<food.length;i++) {
	System.out.println(food[i]);
	}
	}

}
