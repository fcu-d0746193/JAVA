package fcu.oop;

import java.util.Scanner;

public class CheckOddEven {
  /**
   * CheckOddEven.
   */ 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a integer: ");
    int num = scan.nextInt();
    if (num % 2 != 0) {
      System.out.print("The input integer is Odd Number.");
    } else {
      System.out.print("The input integer is Even Number.");
    }
    scan.close();
  }
}
