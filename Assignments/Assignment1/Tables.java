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
		System.out.println("--------------------------------\nLeading Digit  Count           %\n--------------------------------");
		System.out.printf("%-10s %-10s %-10s\n", "0", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "1", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "2", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "3", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "4", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "5", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "6", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "7", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "8", "t", "e");
		System.out.printf("%-10s %-10s %-10s\n", "9", "t", "e");
		System.out.println("--------------------------------\nTOTAL          25        100.00%\n--------------------------------\n--------------------------------");
		//why arent the --- new lines as close as the output in the PDF??
		// FileReader file = new FileReader("rock_jars.txt");
		// BufferedReader reader = new BufferedReader(file);
		
<<<<<<< HEAD
		//how do i read input as ints??
		String text = "";
		// int first_digit;
		String line = reader.readLine();
		while (line != null)
		{
			text += line;
			//text += System.out.println("T");
			line = reader.readLine();
			//newline function
		}
=======
		// //how do i read input as ints??
		// String text = "";
		// // int first_digit;
		// String line = reader.readLine();
		// while (line != null)
		// {
		// 	text += line;
		// 	//text += System.out.println("T");
		// 	line = reader.readLine();
		// 	line = newline
		// }
>>>>>>> 214461831382d69eea1b582ab0445bbb79b7d009

		
		// //code to calculate the first digit of each newline 
		// first_digit = text;
		// while(first_digit >= 10)
		// {
		// 	first_digit = first_digit / 10;
		// }	
		
		// System.out.println(text);
	}
}

//two main problems 
// first: that the readline returns one big int of the whole file not a vertical map so i can deal with the numbers one at a time
// second: the readline returns the numbers as a big string and i need them to be integers

