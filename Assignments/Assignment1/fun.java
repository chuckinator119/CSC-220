import java.io.*;
import java.util.Scanner;

public class fun
{
	public static void main(String[] args) throws Exception
	{
		int a;
		int b;
		File fileText = new File("rock_jars.txt");

		Scanner s = new Scanner(fileText);
		s = new Scanner(fileText);
		while (s.nextLine() != null)
		{
		a = s.nextInt(); 
		b = s.nextInt();
		System.out.println(a);
		System.out.println(b);
		}

	}
}