
public class Car {
private String name;
private String model;
private int year;
Car(String name,String model,int year){
this.name=name;
this.setModel(model);
this.setYear(year);
}
public String getName() {
return name;
}
public void setName(String name) {
this.name=name;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
