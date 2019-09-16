import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Tables{

	public static void main(String[] args) throws FileNotFoundException {
		
		File rock_jars = new File("C:\\Users\\Charlie\\Documents\\GitHub\\CSC-220\\Assignments\\Assignment1\\rock_jars.txt");
		Scanner scan = new Scanner(rock_jars);

		System.out.println(scan.nextLine());
	}
}
