import java.util.Scanner;

// 5. WAJP to print the reverse of the String.
public class ReversofString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = sc.nextLine();
    // Calling the method to reverse the word
    String reversed = Reverse(word);
    System.out.println(reversed);

  }

  private static String Reverse(String word) {
    String reverse = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      reverse += word.charAt(i);
    }
    return reverse;
  }
}