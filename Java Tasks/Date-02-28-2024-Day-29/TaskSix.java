import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //6. To print a maximum of any three given numbers.
      
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the first number:");
    int num1 = sc.nextInt();
    
    System.out.println("Enter the second number:");
    int num2 = sc.nextInt();

    System.out.println("Enter the third number");
    int num3 = sc.nextInt();
    
    if (num1 > num2){
       if (num1 > num3){
        System.out.println("The largest  number is: " + num1);   
       }
       else if (num2 > num3){
        System.out.println("The largest number is: " +num2);
       }
       else if (num3 > num2){
           System.out.println("The largest number is: "+ num3);  
       }
    }
    else if (num2>num1  && num2>num3){
      System.out.println("The largest number is: " + num2);
    }
    else if (num1 < num3 && num2 < num3){
        System.out.println("The largest number is: "+ num3);  
    }

 }
}
