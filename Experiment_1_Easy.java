/*
 Q 1 :- Write a Java program to analyze a string input
        by the user. The program should:
        Count the number of vowels, consonants, digits, and special characters in the string.
 */
import java.util.Scanner;
public class Experiment_1_Easy{
  public static void main (String args[]){
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter the string to analyze :- ");
  String input = sc.nextLine();
  int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
  for (char ch : input.toCharArray()) {
      if (Character.isLetter(ch)) {
          if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
              vowels++;
          } else {
              consonants++;
          }
      } else if (Character.isDigit(ch)) {
          digits++;
      } else if (!Character.isWhitespace(ch)) {
          specialChars++;
      }
  }
      System.out.println("Number of Vowels: " + vowels);
      System.out.println("Number of Consonants: " + consonants);
      System.out.println("Number of Digits: " + digits);
      System.out.println("Number of Special Characters: " + specialChars);
      sc.close();
  }
}