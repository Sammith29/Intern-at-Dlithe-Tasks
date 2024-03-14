import java.util.Scanner;

 //Task-1-Date-02-29-2024-Day-29.docx
    //Task 1: Write a Java program to print even numbers from the array.

public class EvenNumberOfArray {
  public static void main(String[] args) {
    //Printintg the Details
System.out.println("Task-1-Date-02-29-2024-Day-29.docx");
System.out.println("Task 1: Write a Java program to print even numbers from the array.");

    
    Scanner sc = new Scanner(System.in);

    // To Take the size of the array
    System.out.println("Enter the number of elements you want in array : ");
    int n = sc.nextInt();

    // To Initialize the array and to store the even number and
    int arr[] = new int[n];
    int even[] = new int[n];
    int eveo = 0;
    System.out.println("Enter " + n + " numbers :");

    // To get the array
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 0)
        even[i] = arr[i];
    }
    // To check the array has the even number or not
    for (int i = 0; i < n; i++) {
      if (even[i] != 0) {
        eveo = even[i];
        System.out.println(even[i]);
      }
    }

    // To check the array has the even number or not
    if (eveo == 0) {
      System.out.println("There is no even number in the array");
    } else {
      System.out.println("Even numbers in the array: " + eveo);
      sc.close(); // Closing the Scanner resource
    }
  }
}
