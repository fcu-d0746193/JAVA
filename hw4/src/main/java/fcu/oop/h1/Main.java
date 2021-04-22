package fcu.oop.h1;

import java.util.Scanner;

public class Main {
  /**
   * main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String weight = scan.next();
    String height = scan.next();
    
    System.out.print(BmiCalculator.getBmi(weight,height));
    scan.close();
  }

}
