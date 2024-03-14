import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 8. To find area of circle,square, rectangle, triangle as per user selecion.
         * output:
         * 1. square
         * 2. circle
         * 3. rectangle
         * 4. triangle
         * Enter your option: 1
         * Enter side value: 5
         * The area of square= 25
         * Loop Control Statement problems:
         * 1. To print numbers in the user-given range
         * 2. To print even numbers in the user-given range.
         * 3. To Chcek given number is prime or not
         * 4. To find the sum of the numbers in the user-given range.
         * 5 10 =5+6+7+8+9+10=sum
         * 5. To find the sum of the digits in the given number.
         * 123=1+2+3=6(sum)
         * 6. To find the reverse of a given number.
         * 123=321(reverse)
         * 7. To print prime numbers in the user-given range.
         * 8. To find the factorial of a given number
         * 5= 5*4*3*2*1=120(FACTORIAL)
         */

        System.out.println("Select the Operation:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.println("5.Loop Conrtol Statements");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.println("Enter the radius of the circle");
            int r = sc.nextInt();
            System.out.print("Enter Length and Breadth: ");
            System.out.println("The Area of Square=" + 2 * 3.14 * (r * r));
        } else if (option == 2) {
            double r = sc.nextDouble();
            System.out.println("The Area of Circle=" + Math.PI * r * r);
        } else if (option == 3) {
            System.out.print("Enter Length and Breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Area of Rectangle=" + l * b);
        } else if (option == 4) {
            System.out.println("Enter the height from the base: ");
            int h = sc.nextInt();
            System.out.println("The Base of the Triangle: ");
            int b = sc.nextInt();
            System.out.println("The Area of Triangle: " + (h * b) / 2);
        } else if (option == 5) {
            System.out.println("1. To print numbers in the user-given range");
            System.out.println("2. To print even numbers in the user-given range.");
            System.out.println("3. To Chcek given number is prime or not");
            System.out.println("4. To find the sum of the numbers in the user-given range.");
            System.out.println("5. To find the sum of the digits in the given number.");
            System.out.println("6. To find the reverse of a given number.");
            System.out.println("7. To print prime numbers in the user-given range.");
            System.out.println("8. To find the factorial of a given number");
            System.out.println("To perform differnet operation Run the code again ");
            System.out.println("Please Enter the oprtions");
            int op = sc.nextInt();

            // To print numbers in the user-given range
            if (op == 1) {
                System.out.println("Enter the starting number and ending number : ");
                int start = sc.nextInt();
                int end = sc.nextInt();
                for (int i = start; i <= end; i++) {
                    System.out.println(i);
                }

                // To print even numbers in the user-given range.
            } else if (op == 2) {
                System.out.println("Enter the starting number and ending number : ");
                int s = sc.nextInt();
                System.out.println("Enter the ending number : ");
                int e = sc.nextInt();
                for (int i = s; i <= e; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }

                // To Chcek given number is prime or not
            } else if (op == 3) {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                if (num <= 1) {
                    System.out.println("Please Enter the Valid number");
                } else if (num <= 3) {
                    System.out.println(num + "Is a Prime number");
                } else if (num % 2 == 0 || num % 3 == 0) {
                    System.out.println(num + "Is Not a Prime Number"); // Even numbers except 2 and multiples of 3 are
                                                                       // not prime
                } else {
                    for (int i = 5; i * i <= num; i += 2) {
                        if (num % i == 0) {
                            System.out.println(num + "Is Not a Prime Number"); // Not prime if divisible by any number
                                                                               // greater than 3
                        }
                    }
                    System.out.println(num + "Is a Prime Number");
                }
                System.out.println("True");

                // To The sum of the numbers in the user-given range
            } else if (op == 4) {
                System.out.println("Enter the starting number : ");
                int s = sc.nextInt();
                System.out.println("Enter the ending number : ");
                int e = sc.nextInt();
                if (s > e) {
                    System.out.println("The starting number must be less than or equalt to end value");
                }
                int sum = 0;
                for (int i = s; i <= e; i++) {
                    sum += i;
                }
                System.out.println("the sum of the numbers in the user-given range is:" + sum);
            }
            // To find the sum of the digits in the given number.
            else if (op == 5) {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                int digit, sum = 0;
                System.out.print("Enter the number: ");
                num = sc.nextInt();

                while (num > 0) {
                    // Find the last digit of the given number
                    digit = num % 10;
                    // Add the last digit to the variable 'sum'
                    sum += digit;
                    // Remove the last digit from the number
                    num /= 10;
                }

                System.out.println("Sum of Digits: " + sum);
            }
            // To find the reverse of a given number.
            else if (op == 6) {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                int reversed = 0;
                while (num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }
                System.out.println("The Reversed number is: " + reversed);
            }
            // To print prime numbers in the user-given range.
            else if (op == 7) {
                System.out.println("Enter the starting number : ");
                int s = sc.nextInt();
                System.out.println("Enter the ending number : ");
                int e = sc.nextInt();
                for (int num = s; num <= e; num++) {
                    if (isPrime(num)) {
                        System.out.print(num + " ");
                    }
                }
            }
            // To find the factorial of a given number
            else if (op == 8) {
                System.out.println("Enter the number : ");
                int s = sc.nextInt();
                int fact = 1;
                for (int i = 1; i <= s; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + s + " is: " + fact);

            }
        }
        else if (option < 5 || option > 0) {
            System.out.println("Please enter a valid  Option Number between 1 to 5");
        }
    }
    static void userrangenumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
