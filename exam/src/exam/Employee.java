package exam;

public class Employee extends person {
private String salary;
Employee(String name,int height,int year,String salary){
super(name,height,year);
this.setSalary(salary);
}
public String getSalary() {
	return salary;
}

public void setSalary(String salary) {
	this.salary = salary;
}
public String toString() {
return super.toString()+" "+salary;
}
}
