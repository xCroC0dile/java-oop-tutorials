
public class Main {
static void garage(car car) {
System.out.println("this "+car.name+ " is parked in the garage");
}
	
	
	public static void main(String[] args) {
 car car=new car("bmw");
 garage(car);

	}

}
