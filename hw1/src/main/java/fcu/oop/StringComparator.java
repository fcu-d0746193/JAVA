package fcu.oop;

import java.util.Scanner;

public class StringComparator {
  /**
   * str1.equalsIgnoreCase(str2).
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("TEnter a string 1: ");
    String str1 = scan.next();
    System.out.print("TEnter a string 2: ");
    String str2 = scan.next();
    if (str1.equalsIgnoreCase(str2)) {
      System.out.print("The two strings are the same.");
    } else {
      System.out.print("The two strings are not the same.");
    }
    scan.close();
  }
}
