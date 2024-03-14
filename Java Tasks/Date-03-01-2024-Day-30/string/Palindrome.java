import java.util.Scanner;
//evening 
//2. WAJP to check given string is a palindrome or not 
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = sc.nextLine();

    // Calling the method to reverse the word
    String reversed = Reverse(word);
    System.out.println(reversed);
    // Calling the method to check palindrome or not
    boolean isPalindrome = checkPalindrome(word, reversed);
    // Printing the result
    System.out.println(isPalindrome);
  }

  private static String Reverse(String word) {
    String reverse = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reverse += word.charAt(i);
    }
    return reverse;
  }

  private static boolean checkPalindrome(String word, String reversed) {
    if (word.equals(reversed)) {
      System.out.println("The word is a palindrome");
    } else {
      System.out.println("The word is not a palindrome");
    }
    return false;
  }
}