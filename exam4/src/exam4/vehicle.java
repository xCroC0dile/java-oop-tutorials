package exam4;

public abstract class vehicle {
private int year;
private String name;
private String model;
vehicle(String name,String model,int year){
this.setName(name);
this.setModel(model);
this.setYear(year);
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
protected String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public void go(vehicle x) {
System.out.println("the "+x.getName()+ "is moving");
}
}
