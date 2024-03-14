import java.util.Scanner;


 //Task-2-Date-02-29-2024-Day-30
    //Task 2: Write a Java program to find the maximum value of an array.


public class MazNumofArray {

  public static void main(String[] args) {

        //Printintg the Details
System.out.println("Task-2-Date-02-29-2024-Day-30");
System.out.println("Task 2: Write a Java program to find the maximum value of an array.");


    Scanner sc = new Scanner(System.in);
    int[] arr = new int[6];
    System.out.println("Enter the elements of the array: ");
    int max = 0;
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < 5+1; i++) {
        if (arr[i] >= max) {
          max = arr[i];
         
      }
    }
    System.out.println("The Maximum value of the array is: "+max);
    // System.out.println(isSorted(arr));
  }
}
/*
 * boolean isSorted(int[] arr){
 * for(int i=0;i<arr.length-1;i++){
 * if(arr[i]>arr[i+1])return false;
 * }
 * return true;
 * }
 */