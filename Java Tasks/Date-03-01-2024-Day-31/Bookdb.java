import java.util.Scanner;

//Date-03-01-2024-Day-31
//2 Write a java program Write a java program to create a Book class, 
//store the data of the book then print the data of the book from the same class.
public class Bookdb {
  public static void main(String[] args) {
   
    System.out.println("Date-03-01-2024-Day-30"); 
    System.out.println("Write a java program to 2. WAJP to create a Book class, store the data of the book then print the data of the book from the same class."); 

    Scanner sc = new Scanner(System.in);

    // WAJP to create an employee class, store the data of an employee // then print
    // the data of the employee from the same


    Book BookDb = new Book();
    System.out.println("Enter the Book id: ");
    BookDb.Bookid = sc.nextInt();
    System.out.println("Enter the Book name: ");
    BookDb.BookName = sc.next();
    System.out.println("Enter the Book Price : ");
    BookDb.Price = sc.nextInt();
    System.out.println("Enter the  Author: ");
    BookDb.Author = sc.next();
    System.out.println("Enter the Publisher: ");
    BookDb.Publisher = sc.next();
    System.out.println("The Book id is: " + BookDb.Bookid);
    System.out.println("The Book name is: " + BookDb.BookName);
    System.out.println("The Book Price is: " + BookDb.Price);
    System.out.println("The Book Author is: " + BookDb.Author);
    System.out.println("The Publisher is: " + BookDb.Publisher);
  }
}

class Book {
  int Bookid;
  String BookName;
  int Price;
  String Author;
  String Publisher;
}
