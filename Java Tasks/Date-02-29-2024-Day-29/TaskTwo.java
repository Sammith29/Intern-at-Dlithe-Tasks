import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        //2. To check if the given num is even or odd//if-else
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
          System.out.println("The given number is Even");
        }
        else {
            System.out.println("The given number is ODD");
        }

}
}
