package com.assignment.hibernateTest;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
	  
	  Scanner scanner = new Scanner(System.in);
      int choice;

      CredOperations credOpe = new CredOperations();
      do {
    	  System.out.println("-----------------------------------------------------------------");
    	  System.out.println("!!!!!!*****Welcome to Employee Details Crud Operations*****!!!!!!");
    	  System.out.println("-----------------------------------------------------------------");
          System.out.println("Choose an operation:");
          System.out.println("1. Insert Project");
          System.out.println("2. Insert Employee");
          System.out.println("3. Delete Employee");
          System.out.println("4. Search Employee");
          System.out.println("5. Update Employee");
          System.out.println("6. Exit Employee Application");
          System.out.print("Enter your choice: ");
          choice = scanner.nextInt();
          scanner.nextLine();  // Consume the newline character

          switch (choice) {
              case 1:
                  credOpe.insertProject(scanner);;
                  break;
              case 2:
            	  credOpe.insertEmployee(scanner);
                  break;
              case 3:
            	  credOpe.deleteEmployee(scanner);
                  break;
              case 4:
            	  credOpe.searchEmployee(scanner);
                  break;
              case 5:
                  credOpe.updateEmployee(scanner);
                  break;    
              case 6:
                  System.out.println("Exiting...");
                  break;
              
              default:
                  System.out.println("Invalid choice. Please try again.");
          }
      } while (choice != 0);

      scanner.close();
  }
  }
