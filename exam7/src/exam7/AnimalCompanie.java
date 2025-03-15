package exam7;

public abstract class AnimalCompanie {
private String name;
AnimalCompanie(String name){
this.setName(name);	
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
abstract void action();
}
