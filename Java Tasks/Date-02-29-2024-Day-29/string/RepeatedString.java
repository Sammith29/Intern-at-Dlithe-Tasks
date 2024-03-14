import java.util.Scanner;

//5. WAJP to print repeated chars from the String.
//S=&quot;abcda&quot;
//o/p: &quot;a&quot;
public class RepeatedString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string");
    String str = sc.nextLine();
    checkRepeatedchar(str);

  }

  private static void checkRepeatedchar(String str) {
    System.out.println("The repeat the strings are:");
    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);
      for (int j = i + 1; j < str.length(); j++) {
        if (currentChar == str.charAt(j)) {
          System.out.println(currentChar);
        }
      }
    }
  }
}
