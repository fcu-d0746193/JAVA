package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /**
   * change words in a string.
   */
  public static void main(String[] args) {
    PasswordEncoder encoder = new PasswordEncoder();
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.print("Please enter a password: ");
      String password = scan.next();
      if (password.equals("exit")) {
        break;
      }
      password = encoder.encode(password);
      System.out.println(password);
    }
    scan.close();
  }

}
