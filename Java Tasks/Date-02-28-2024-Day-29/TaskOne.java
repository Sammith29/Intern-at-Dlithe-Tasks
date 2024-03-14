import java.util.Scanner;

public class TaskOne {

 //1. To check if the given num is +ve or not. //simple if
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
     if(a < 0){
        System.out.println("Negative number");
    }
}
}