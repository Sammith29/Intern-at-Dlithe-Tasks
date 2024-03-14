import java.util.Scanner;

public class TaskFoure {
    public static void main (String args []){
        // 4. To print the day as per the given day number.//else-if
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        if ( a > 0 && a !=0 ){
            if ( a == 1){
                System.out.println("The day is Monday");
            }
            else if (a==2){
                System.out.println("The Day is Tuesday");
            }
            else if (a==3) {
                System.out.println("The Day is Wednesday");
                
            }
            else if (a==4){
                System.out.println("The Day is Thursday");
            }
            else if (a==5){
                System.out.println("The Day is Friday");
            }
            else if (a==6){
                System.out.println("The Day is Saturday");
            }
            else if (a==7){
                System.out.println("The Day is Sunday");
            }
            else {
                System.out.println("The number is greater than 7");
            }
        }
        else {
            System.out.println("Please Enter the valid number");
        }
    }
}
