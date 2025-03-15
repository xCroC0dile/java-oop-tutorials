
public class main {

	public static void main(String[] args) {
     bicycle bike =new bicycle();
     car car=new car();
     boat boat=new boat();
     vehicle[] racers= {bike,car,boat};
     for(vehicle x:racers) {
    	x.go();
     }
	}

}
