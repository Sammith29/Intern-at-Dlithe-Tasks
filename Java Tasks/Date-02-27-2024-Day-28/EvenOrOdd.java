import java.util.Scanner;
/*
 Task-3-Date-02-27-2024-Day-28.docx
Task 3: Write a Java program to read a positive integer number from the user and check if the given
number is even or odd. If the given number is even number then return true else return false without
using if-else control statement.
 */
public class EvenOrOdd {
    
    // To Print the Error message and returns a boolean value
    public static boolean negative() {
        System.out.println("The enterd number is Nagative please enter the positvie number Try Again");
        return false;
    }

    // To return true to conmirmation to procede to next level
    public static boolean conclude() {
        return true;
    }

    // To check even or not
    public static boolean isEven(int a) {
        boolean result = (a %  2 ) == 0 ? true : false;
        return result;
    }
    
    public static  boolean programError(int a){
        System.out.println("Program has some Error");
        return false;
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        //Printintg the Task Details 
        System.out.println("Task-3-Date-02-27-2024-Day-29.docx");
        System.out.println("Task 3: Write a Java program to read a positive integer number from the user and check if the given number is even or odd. If the given number is even number then return true else return false without using if-else control statement.");
        
        // Takes the input from the user4545
        System.out.print("Enter the Positive Number a: ");
        int a = scanner.nextInt();

        // To check number is positive or not
        boolean s = a <= 0 ? EvenOrOdd.negative() : EvenOrOdd.conclude();
        boolean g = s = true ? EvenOrOdd.isEven(a) :  EvenOrOdd.programError(a);
        System.out.println(g);
        scanner.close();
    }

}
