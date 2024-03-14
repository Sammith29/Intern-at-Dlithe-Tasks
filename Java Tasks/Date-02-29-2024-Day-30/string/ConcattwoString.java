import java.util.Scanner;

//3. WAJP to concatenate given two strings.
public class ConcattwoString {
  public static void main(String[] args) {
  
  //Printintg the Details
System.out.println("Task-7-Date-02-29-2024-Day-30");
System.out.println("Task 7: Write a Java program to print the reverse of a given string. ");

    Scanner sc = new Scanner(System.in);
    // Taking the first string input
    System.out.println("Enter the first sting");
    String a = sc.next();
    // Taking the second string input
    System.out.println("Enter the Second string");
    String b = sc.next();

    String output = concatenation(a, b);
    // Printing the result
    System.out.println("The concatenated string is: " + output);
  }

  private static String concatenation(String a, String b) {
    // Concatenating the two strings
    String result = a.concat(b);
    return result;
  }
}