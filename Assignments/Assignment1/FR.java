import java.io.BufferedReader;
import java.io.FileReader;

public class FR
{
	public static void main(String[] args) throws Exception
	{
		FileReader file = new FileReader("rock_jars.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while (line != null)
		{
			text += line;
			System.out.println(text);
			line = reader.readLine();
			

		}
	}
}