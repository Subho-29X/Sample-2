/*
 Q 2 :- Write a Java program to perform matrix
        operations (addition, subtraction, and multiplication) on two
        matrices provided by the user. The program should:
        - Check the dimensions of the matrices to ensure valid operations.
 */
import java.util.Scanner;

public class Experiment_1_Medium {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number of rows and columns for Matrix 1: ");
  int rows1 = sc.nextInt();
  int cols1 = sc.nextInt();

  System.out.println("Enter the number of rows and columns for Matrix 2: ");
  int rows2 = sc.nextInt();
  int cols2 = sc.nextInt();

  if (rows1 <= 0 || cols1 <= 0 || rows2 <= 0 || cols2 <= 0) {
      System.out.println("Error: Invalid dimensions");
      return;
  }

  int[][] matrix1 = new int[rows1][cols1];
  int[][] matrix2 = new int[rows2][cols2];

  System.out.println("Enter elements of Matrix 1:");
  for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < cols1; j++) {
          matrix1[i][j] = sc.nextInt();
      }
  }

  System.out.println("Enter elements of Matrix 2:");
  for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < cols2; j++) {
          matrix2[i][j] = sc.nextInt();
      }
  }

  System.out.println("Choose an operation:");
  System.out.println("1. Addition");
  System.out.println("2. Subtraction");
  System.out.println("3. Multiplication");
  int choice = sc.nextInt();

  switch (choice) {
  case 1: 
      if (rows1 == rows2 && cols1 == cols2) {
          System.out.println("Matrix Addition:");
          for (int i = 0; i < rows1; i++) {
              for (int j = 0; j < cols1; j++) {
                  System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
              }
              System.out.println();
          }
      } else {
          System.out.println("Error: Addition requires both matrices to have the same dimensions.");
      }
      break;

      case 2: 
      if (rows1 == rows2 && cols1 == cols2) {
          System.out.println("Matrix Subtraction:");
          for (int i = 0; i < rows1; i++) {
              for (int j = 0; j < cols1; j++) {
                  System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
              }
              System.out.println();
          }
      } else {
          System.out.println("Error: Subtraction requires both matrices to have the same dimensions.");
      }
      break;

      case 3: 
      if (cols1 == rows2) {
          System.out.println("Matrix Multiplication:");
          int[][] multiplication = new int[rows1][cols2];
          for (int i = 0; i < rows1; i++) {
              for (int j = 0; j < cols2; j++) {
                  multiplication[i][j] = 0;
                  for (int k = 0; k < cols1; k++) {
                      multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                  }
                  System.out.print(multiplication[i][j] + " ");
              }
              System.out.println();
          }
      } else {
          System.out.println("Error: Multiplication requires the number of columns in Matrix 1 to equal the number of rows in Matrix 2.");
      }
      break;

  default:
      System.out.println("Invalid choice.");
  }

  sc.close();
}
}
