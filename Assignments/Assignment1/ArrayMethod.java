import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
	public static void main(String[] args) {
		int[] data = readFiles("rock_jars.txt");
		System.out.println(Arrays.toString(data));

		System.out.println("The length of myArray is" + data.length);
		System.out.println(
				"--------------------------------\nLeading Digit  Count           %\n--------------------------------");
		System.out.printf("%-10s %-10s %-10s\n", "0", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "1", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "2", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "3", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "4", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "5", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "6", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "7", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "8", "     t", "       e%");
		System.out.printf("%-10s %-10s %-10s\n", "9", "     t", "       e%");
		System.out.println(
				"--------------------------------\nTOTAL          25        100.00%\n--------------------------------\n--------------------------------");

		for (int i = 0; i < data.length; i++) {
			System.out.println("1");
		}

		// for(int count = 0;count < data.length;count++)
		// {
		// first_digit = text;
		// while(first_digit >= 10)
		// {
		// first_digit = first_digit / 10;

		// }

	}

	public static int[] readFiles(String file) {

		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int ctr = 0;
			while (s.hasNextInt()) {
				ctr++;
				s.nextInt();
			}
			int[] arr = new int[ctr];
			Scanner s1 = new Scanner(f);
			for (int i = 0; i < arr.length; i++)
				arr[i] = s1.nextInt();
			return arr;
		} catch (Exception e) {
			return null;
		}

		// code to calculate the first digit of each newline
		// int first_digit;

		// for (int i=0; i < arr.length;i++)
		// {
		// first_digit = text;
		// while(first_digit >= 10)
		// {
		// first_digit = first_digit / 10;
		// }
		// }

	}
}