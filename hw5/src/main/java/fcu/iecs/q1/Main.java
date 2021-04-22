package fcu.iecs.q1;

import java.util.Scanner;

public class Main {
  
  /**
   * Main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    String balans = scan.next();
    int balance = Integer.valueOf(balans);
    
    Player p1 = new Player(name,balance);
    p1.play();
    
    scan.close();
  }

}
