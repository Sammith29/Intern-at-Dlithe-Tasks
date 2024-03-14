import java.util.Scanner;

public class TaskThree {

    public static void main(String args[]) {
     //    3. To check if the given character is a vowel or not.
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a') {
            System.out.println("The Entered Character is vowel ");
        } else if (ch == 'e') {
            System.out.println("The Entered Character is vowel ");
        } else if (ch == 'i') {
            System.out.println("The Entered Character is vowel");
        } else if (ch == 'o') {
            System.out.println("The Enterend Character is vowel");
        } else if (ch == 'u') {
            System.out.println("The Entered Character is vowel");
        } else {
            System.out.println("The Entered Character is vowel");
        }
    }
}
