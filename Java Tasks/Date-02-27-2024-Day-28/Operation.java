public class Operation {
    //Task-1-Date-02-27-2024-Day-28.docx
    //Task 1: Write a Java program to perform subtraction 
    // and division operations by using static and non-static methods.
      
    public static void main(String args[]) {
        byte a = 100;
        byte b = 3;
        
           //Printintg the Details
           System.out.println("Task-1-Date-02-27-2024-Day-28.docx");
           System.out.println("Task 1: Write a Java program to perform subtraction and division operations by using static and non-static methods. ");
         
        //Subtraction 
        Operation o= new Operation();
        int c = o.Subtraction(a,b);

       //Display the return value
        System.out.println("The Subtraction of "+a+"-"+b+": "+c);

        //Division
        float h = Division(a, b);

        //Display the return value
        System.out.println("The Quotient is: "+h);
    }

    int Subtraction(byte s, byte t) {
        int m = s - t;
        return m;
    }
    static float Division(byte a, byte b) {
        float l =(float) a / b;
        return(l);
    }
}
