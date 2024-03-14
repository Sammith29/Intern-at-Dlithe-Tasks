import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //To print a minimum of any two given numbers.//if-else
 
        System.out.println("Enter the number");
        int  num1 = sc.nextInt();
        
        System.out.println("Enter another number");
        int num2 = sc.nextInt();
         
        int min = num2;
        //Checking 
        if (num1 < num2){
             min = num1;
             System.out.println("The minimun of "+num1+" to "+num2+" is: "+ min);
     
        } 
        else { 
            System.out.println("The minimun of "+num1+" to "+num2+" is: "+ min);
        }
    }
}