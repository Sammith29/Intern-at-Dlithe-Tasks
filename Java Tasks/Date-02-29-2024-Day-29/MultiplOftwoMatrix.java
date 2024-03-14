import java.util.Scanner;

 //Task-7-Date-02-29-2024-Day-29.docx
 //Task 7: Write a Java program to perform multiplication of two matrices.




public class MultiplOftwoMatrix {
  public static void main(String[] args) {

      //Printintg the Details
      System.out.println("Task-7-Date-02-29-2024-Day-29.docx");
      System.out.println("Task 7: Write a Java program to perform multiplication of two matrices.");
      

    Scanner sc = new Scanner(System.in);

    // Initialize the Array to store the matrix
    int mat1[][] = new int[2][2];
    int mat2[][] = new int[2][2];
    int result[][] = new int[2][2];
    // input elements of first 1st matrix
    System.out.println("\nInput Elements of First Matrix :");
    for (int i = 0; i < mat1.length; i++) {
      for (int j = 0; j < mat1.length; j++) {
        mat1[i][j] = sc.nextInt();
      }
    }
    // input elements of Sencond 2nd matrix
    System.out.println("\nInput Elements of Second Matrix :");
    for (int i = 0; i < mat2.length; i++) {
      for (int j = 0; j < mat2.length; j++) {
        mat2[i][j] = sc.nextInt();
      }
    }

    // To Multipye two matrices
    for (int i = 0; i < mat1.length; i++) {
      for (int j = 0; j < mat2.length; j++) {
        result[i][j] = mat1[i][j] * mat2[i][j];
      }
    }
    System.out.println("The mutiplicaton of two meaticx are: ");
    // To Display the result
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println("");
    }
    sc.close(); // Closing the Scanner resource
  }
}
