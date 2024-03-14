import java.util.Scanner;

 //Task-4-Date-02-29-2024-Day-30
 //Task 4: Write a Java program to print prime numbers from the array.



public class PrimeNumFromArray {
  public static void main(String[] args) {
   
      //Printintg the Details
      System.out.println("Task-4-Date-02-29-2024-Day-30");
      System.out.println("Task 4: Write a Java program to print prime numbers from the array.");
      
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array element:");
    int[] arr = new int[5];
    int[] primeNumbers=new int[5];
     for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
      if (isPrime(arr[i])) {
          primeNumbers[i] = arr[i];
      }
    }
    System.out.println("Prime numbers in the array are:");
   for(int i=0;i<5;i++){
    System.out.println(primeNumbers[i]);   
   }

  }
  // To check arrays are prime or not
  public static boolean isPrime(int num){
    if(num<=1){
      return false;
    }
    for(int i=2;i<num;i++){
       if(num %i ==0){
         System.out.println(num+" "+i);
         return false;
       }
    }
      return true;
  }
}
