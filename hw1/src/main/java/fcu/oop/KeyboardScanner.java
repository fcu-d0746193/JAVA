package fcu.oop;

import java.util.Scanner;

public class KeyboardScanner {
  /**
   * KeyboardScanner.
   */ 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a integer: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter a float point number: ");
    float num2 = scanner.nextFloat();
    System.out.print("Enter a you name: ");
    String name = scanner.next();
    System.out.printf("Hi " + name + ", the multiplication of "
        + num1 + " and " + num2 + " is %.2e",num2 * num1);
    scanner.close();
  }
}
