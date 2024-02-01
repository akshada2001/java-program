
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		  try {
	            File file = new File("D:\\books pdf\\AI\\file_reader.java");
	            Scanner sc = new Scanner(file);

	            while (sc.hasNext()) {
	                System.out.println(sc.next());
	            }
	            sc.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	}

}













