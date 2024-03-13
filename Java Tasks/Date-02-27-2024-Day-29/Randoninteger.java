import java.util.Random;
/*
 Task-4-Date-02-27-2024-Day-29.docx
Task 4: Write a Java program to return a positive 6-digit random integer number.
 */
public class Randoninteger {
     public static void main(String[] args) {
       
       //Printintg the Details
       System.out.println("Task-4-Date-02-27-2024-Day-29.docx");
       System.out.println("Task 4: Write a Java program to return a positive 6-digit random integer number.");
     
       Random randomNumber = new Random();
        int number = randomNumber.nextInt(999999);
       System.out.println("Positive 6-digit number:"+number);
    }
}
