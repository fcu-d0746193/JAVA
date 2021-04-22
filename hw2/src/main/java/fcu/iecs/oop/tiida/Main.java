package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /**
   * main.
   */
  public static void main(String[] args) {
    NissanTiida nissan = new NissanTiida();
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int time = scan.nextInt();
    for (int i = 1;i <= time;i++) {
      nissan.tiida();
    }
    scan.close();
  }

}
