import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

   try {
	FileWriter writer = new FileWriter("test.txt");
	writer.write("hello!");
	writer.append("yos!");
	writer.close();
} catch (IOException e) {
	e.printStackTrace();
}
	}



}
