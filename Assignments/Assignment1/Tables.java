import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Tables{

	public static void main(String[] args) throws Exception{
		// File rock_jars = new File("C:\\Users\\Charlie\\Documents\\GitHub\\CSC-220\\Assignments\\Assignment1\\rock_jars.txt");
		// Scanner scan = new Scanner(rock_jars);
		// System.out.println(scan.nextLine());
		System.out.println("--------------------------------\nLeading Digit  Count           %\n--------------------------------\n");
		System.out.println("0\n1\n2\n3\n4\n5\n6\n7\n8\n9");
		System.out.println("--------------------------------\nTOTAL          25        100.00%\n--------------------------------\n--------------------------------");
		//why arent the --- new lines as close as the output in the PDF??
		FileReader file = new FileReader("rock_jars.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while (line != null)
		{
			text += line;
			System.out.println("ME");
			line = reader.readLine();
		}
		System.out.println(text);
	}
}
