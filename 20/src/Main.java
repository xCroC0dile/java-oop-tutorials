
public class Main {

	public static void main(String[] args) {
  Garage garage=new Garage();
  Car car1=new Car("ferrari");
  Garage.park(car1);
  System.out.println(Car.numberofcars);
	}
}
