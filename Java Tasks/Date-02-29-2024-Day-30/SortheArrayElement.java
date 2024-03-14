import java.util.Scanner;


 //Task-3-Date-02-29-2024-Day-30
 //Task 3: Write a Java program to sort the array elements.


public class SortheArrayElement {
   public static void main(String[] args){
     
 //Printintg the Details
 System.out.println("Task-3-Date-02-29-2024-Day-30");
 System.out.println("Task 3: Write a Java program to sort the array elements.");
 

     Scanner sc = new Scanner(System.in);
     int [] arr = new int[5];
     int temp;
     
     System.out.println("Enter the arrray elements:");
      for (int i=0; i<5; i++){
        arr[i]=sc.nextInt();  
      }

       for (int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
      System.out.println("The After sorting this is in  ascending order");
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
   }
}
