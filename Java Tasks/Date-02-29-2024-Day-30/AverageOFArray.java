import java.util.Scanner;

 //Task-5-Date-02-29-2024-Day-30
 //Task 5: Write a Java program to find the average of the array.




public class AverageOFArray {
  public static void main(String[] args) {
//Printintg the Details
System.out.println("Task-5-Date-02-29-2024-Day-30");
System.out.println("Task 5: Write a Java program to find the average of the array.");


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements you want in array : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int sum = 0;
    float Average;
    System.out.println("Enter the Array elemenst");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];

    }
      Average = sum % a.length+1;
  System.out.println("Sum of the array elements: " + sum+" "+Average);  
  }
}
