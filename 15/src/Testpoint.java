
public class Testpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
  Point points[]=new Point[3];
  points[0]=new Point(2,5);
  points[1]=new Point(7,5);
  points[2]=new Point(6,14);
  for(i=0;i<points.length;i++) {
System.out.println("x="+points[i].getX());
System.out.println("y="+points[i].getY());
points[i].distance();
points[0].setX(5);
  }

	}

}
