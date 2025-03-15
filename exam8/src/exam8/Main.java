package exam8;

public class Main {

	public static void main(String[] args) {
 Boat boat=new Boat();
 Car car=new Car();
 Vehicle[] veh=new Vehicle[2];
 veh[0]=boat;
 veh[1]=car;
 for(int i=0;i<veh.length;i++) {
	veh[i].go();
 }
	}

}
