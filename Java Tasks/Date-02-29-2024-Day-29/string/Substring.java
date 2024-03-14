import java.util.Scanner;
/*
4. WAJP to check if the given string can contain the
given substring.
S=&quot;Mite@1234&quot;, sb=&quot;Mite&quot;
o/p: true
 */
public class Substring{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.next();
    System.out.println("Enter the Second index");
    String sub = sc.next();
     boolean contains = str.contains(sub);
    System.out.println(contains);
  }
}