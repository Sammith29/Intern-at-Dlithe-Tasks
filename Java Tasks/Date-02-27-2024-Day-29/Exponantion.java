import java.util.Scanner;

public class Exponantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        //Takes the input from the user
        System.out.print("Enter the first number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number b: ");
        int b = scanner.nextInt();

        // Check if a < b using modulo operator
        int result = Math.abs(a) < Math.abs(b) ? power(a, b) : power(b, a);

        System.out.println("The Exponantial : " + result);
    }

    static int power(int base, int exponent) {
        System.out.println(base);
        System.out.println(exponent);
        System.out.println("The smallest one is " + base);

        double result =  Math.pow(base, exponent);
        return (int) result;
    }
}