import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Tables
{

	public static void main(String[] args) throws Exception
	{
		// File rock_jars = new File("C:\\Users\\Charlie\\Documents\\GitHub\\CSC-220\\Assignments\\Assignment1\\rock_jars.txt");
		// Scanner scan = new Scanner(rock_jars);
		// System.out.println(scan.nextLine());
		System.out.println("--------------------------------\nLeading Digit  Count           %\n--------------------------------\n");
		System.out.println("0\n1\n2\n3\n4\n5\n6\n7\n8\n9");
		System.out.println("--------------------------------\nTOTAL          25        100.00%\n--------------------------------\n--------------------------------");
		//why arent the --- new lines as close as the output in the PDF??
		FileReader file = new FileReader("rock_jars.txt");
		BufferedReader reader = new BufferedReader(file);
		
		//how do i read input as ints??
		String text = "";
		// int first_digit;
		String line = reader.readLine();
		while (line != null)
		{
			text += line;
			//text += System.out.println("T");
			line = reader.readLine();
		}

		
		//code to calculate the first digit of each newline 
		// first_digit = text;
		// while(first_digit >= 10)
		// {
		// 	first_digit = first_digit / 10;
		// }	
		
		System.out.println(text);
	}
}

//two main problems 
// first: that the readline returns one big int of the whole file not a vertical map so i can deal with the numbers one at a time
// second: the readline returns the numbers as a big string and i need them to be integers

