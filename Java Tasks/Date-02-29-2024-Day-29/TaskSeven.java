import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 7. To perform arithmetic operation based on user selection.
         * 1.Addition
         * 2.Subtraction
         * 3.Multiplication
         * 4.Division
         * Enter Your Option: 1
         * enter enter a,b values: 3 6
         * the add of two numbers = 9
         */

        System.out.println("Select the Operation:");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int option = sc.nextInt();
        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (option == 1) {
            int v =addition(num1, num2);
            System.out.printf("The add of two numbers: "+v);
        } else if (option == 2) {
            int v = substraction(num1, num2);
            System.out.printf("The result of subtraction is: "+v);
        } else if (option == 3) {
            int v = multiply(num1, num2);
            System.out.println("The Product of two numbers is: " +v);
        } else if (option == 4) {
            if (num2 != 0){
                 float v =  divide(num1, num2);
                System.out.println("The division of two numbers is: " + v);
            }
            else {
                System.out.println("Dividend should not be zero.");
            }
        }
        else if( option >= 5){
            System.out.println("Invalid Option Please Select the valid option");
        }
    }

    // Addition
    static int addition(int x, int y) {
        return x + y;
    }

    // Subtraction
    static int substraction(int x, int y) {
        return x - y;
    }

    // Product of two number
    static int multiply(int x, int y) {
        return x * y;
    }

    // Divide
    static float divide(int x, int y) {
        return x / y;
    }
}
