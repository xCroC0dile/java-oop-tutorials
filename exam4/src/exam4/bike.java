package exam4;

public class bike extends vehicle{
private String nom;
private int padels;
bike(String name,String model,int year,int padels){
super(name,model,year);
this.setPadels(padels);
}
public int getPadels() {
	return padels;
}

public void setPadels(int padels) {
	this.padels = padels;
}

}
