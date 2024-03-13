import java.util.Scanner;

public class Threepositiveinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        // Validate positive input
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error:the entered number must be positive.");

        }
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant >= 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The two real roots are: " + root1 + " and " + root2);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
            System.out.println("The discriminant are:" + discriminant);
        }
    }

}
