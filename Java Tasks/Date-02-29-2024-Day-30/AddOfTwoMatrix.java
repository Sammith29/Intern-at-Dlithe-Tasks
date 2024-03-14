
public class AddOfTwoMatrix {

   //Task-6-Date-02-29-2024-Day-30
 //Task 6: Write a Java program to Perform addition of two matrices. 


  public static void main(String[] args) {
//Printintg the Details
System.out.println("Task-6-Date-02-29-2024-Day-30");
System.out.println("Task 6: Write a Java program to Perform addition of two matrices. ");


    int[][] matrix1 = { { 1, 3 }, { 7, 9 } };
    int[][] matrix2 = { { 2, 4 }, { 8, 10 } };
    int[][] matrix3 = new int[2][2];
    int[][] matrix5 = new int[2][2];
    // Printing the 2nd 2d matrix
    System.out.println("The First matrix is:");
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1[i].length; j++) {
        System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    // Printing the 2nd 2d matrix
    System.out.println("The Second matrix is: ");
    for (int i = 0; i < matrix2.length; i++) {
      for (int j = 0; j < matrix2[i].length; j++) {
        System.out.print(matrix2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    // Addition of Two Matrix
    System.out.println("Addition of Two Matrices");

    // Add matrices and store the result in matrix3
    matrix3 = addMatrices(matrix1, matrix2, matrix5);
  }

  // Method to add two matrices
  private static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int[][] matrix5) {
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix2[i].length; j++) {
        matrix5[i][j] = matrix1[i][j] + matrix2[i][j];
        System.out.print(matrix5[i][j] + " ");
      }
      System.out.println();
    }

    // Return the resulting matrix
    return matrix5;
  }
}