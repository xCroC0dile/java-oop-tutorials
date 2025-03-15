package exam;

public class person {
private String name;
private int height;
private int year;
person(String name,int height,int year){
this.setName(name);
this.setHeight(height);
this.setYear(year);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String toString() {
return this.name+" "+this.height+" "+this.year;
}
}
