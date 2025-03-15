import java.lang.Math;
public class Point {
private double x;
private double y;
Point(double x,double y){
this.x=x;
this.y=y;
}
public double getX() {
return x;
}
public void setX(int x) {
this.x=x;
}
public double getY() {
return y;
}
public void setY(int y) {
this.y=y;
}
public void distance() {
System.out.println(Math.sqrt(Math.pow(x, 2)+Math.pow(y,2)));
}
}
