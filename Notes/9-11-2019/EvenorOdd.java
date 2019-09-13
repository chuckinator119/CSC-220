import java.util.Scanner;  // Import the Scanner class

class EvenorOdd {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a number");

    String number = myObj.nextLine();  // Read user input
    System.out.println("number is: " + number);  // Output user input
  }
}