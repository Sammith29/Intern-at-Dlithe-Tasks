public class Operation {

    public static void main(String args[]) {
        byte a = 100;
        byte b = 3;
        
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
