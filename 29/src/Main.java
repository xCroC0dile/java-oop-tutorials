import java.io.File;

public class Main {

	public static void main(String[] args) {
     File file=new File("D:/cs1.6/cstrike.exe");
     System.out.println(file.exists());
     System.out.println(file.getAbsolutePath());
	}

}
