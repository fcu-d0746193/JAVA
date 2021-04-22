package fcu.iecs.q2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String personId = scan.next();
    float money = scan.nextFloat();

    Bank p1 = new Bank();
    if (p1.createAccount(personId) == true) {
     float a = p1.withdraw(personId,money);
     float b = p1.deposit(personId,money);
     System.out.print("Y" + a + b);
    } else {
     System.out.print("N");
    }
    scan.close();
  }

}
