import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Add
{
	public static void main(String[] args)
	{
		int[] data = readFiles("list2.txt");
		System.out.println(Arrays.toString(data));
		int[] arr = {10, 20, 30, 40, 50};
		Arrays.copyOfRange(arr, 0, 4);          // returns {10, 20}
		Arrays.copyOfRange(arr, 4, 8);          // returns {20, 30, 40}
		Arrays.copyOfRange(arr, 8, 16); // returns {30, 40, 50} (length = 5
		System.out.println(data.lenth);

	}

	public static int[] readFiles(String file)
	{

		try
		{
			File f = new File(file);
			Scanner s = new Scanner(f);
			int ctr = 0;
			while(s.hasNextInt())
			{
				ctr++;
				s.nextInt();
			}
			int[] arr = new int[ctr];
			Scanner s1 = new Scanner(f);
			for (int i = 0; i < arr.length; i++)
				arr[i] = s1.nextInt();
			return arr;
		}
		catch(Exception e)
		{
			return null;
		}

	}
}