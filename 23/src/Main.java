
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car car=new Car("wolkswagen","golf",2021);
System.out.println(car.getName()+"\n"+car.getModel()+"\n"+car.getYear()+"\n");
car.setName("meh");
System.out.println(car.getName());

	}

}
