import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Tables{

	public static void main(String[] args) throws FileNotFoundException {
		
		File random = new File("C:\\Users\\Charlie\\Documents\\GitHub\\CSC-220\\Assignments\\Assignment1\\random.txt");
		Scanner scan = new Scanner(random);

		System.out.println(scan.nextLine());
	}
}
