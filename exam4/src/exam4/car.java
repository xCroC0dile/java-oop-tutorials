package exam4;

public class car extends vehicle{
private int doors;
car(String name,String model,int year,int doors){
super(name,model,year);	
this.setDoors(doors);
}

public int getDoors() {
return doors;
}
public void setDoors(int doors) {
this.doors=doors;
}
}
