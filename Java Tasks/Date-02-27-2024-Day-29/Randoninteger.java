import java.util.Random;

public class Randoninteger {
     public static void main(String[] args) {

       Random randomNumber = new Random();
        int number = randomNumber.nextInt(999999);
       System.out.println("Positive 6-digit number:"+number);
    }
}
