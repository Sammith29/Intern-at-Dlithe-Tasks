import java.util.Scanner;

//Date-03-01-2024-Day-30
//Write a java program  to create an employee class,
// store the data of an employee then print the data of the employee from the same
public class Empdb {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Date-03-01-2024-Day-30"); 
    System.out.println("Write a java program  to create an employee class, store the data of an employee then print the data of the employee from the same"); 
    // Write a java program  to create an employee class, store the data of an employee then print
    // the data of the employee from the same
    Database db = new Database();
    System.out.println("Enter the employees id: ");
    db.Empid = sc.nextInt();
    System.out.println("Enter the employees name: ");
    db.EmpName = sc.next();
    System.out.println("Enter the employees age: ");
    db.EmpAge = sc.nextInt();
    System.out.println("Enter the employees Designation: ");
    db.EmpDesignation = sc.next();
    System.out.println("Enter the Employee Salary: ");
    db.EmpSalary = sc.next();
    System.out.println("The Employees id is: " + db.Empid);
    System.out.println("The Employees name is: " + db.EmpName);
    System.out.println("The Employees age is: " + db.EmpAge);
    System.out.println("The Employees Designation is: " + db.EmpDesignation);
    System.out.println("The Employees Salary is: " + db.EmpSalary);
  }
}

class Database {
  int Empid;
  String EmpName;
  int EmpAge;
  String EmpDesignation;
  String EmpSalary;
}
