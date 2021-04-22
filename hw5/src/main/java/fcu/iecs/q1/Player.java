package fcu.iecs.q1;

import java.util.Random;

public class Player {
  private String name;
  private int balance;
  
  public Player(String name,int balance) {
    this.name = name;
    this.balance = balance;
  }
  
  /**
   * play.
   */
  public void play() {
    balance -= 5;
    int[] results = new int[3];
    for (int i = 0; i < 3; i++) {
      Random ran = new Random();
      int random = ran.nextInt(4);
      switch (random) {
        case 0:
          results[i] = 0;
          System.out.print("Cherry");
          if (i != 2) {
            System.out.print(", ");
          }
          break;
        case 1:
          results[i] = 1;
          System.out.print("Watermelon");
          if (i != 2) {
            System.out.print(", ");
          }
          break;
        case 2:
          results[i] = 2;
          System.out.print("Lemon");
          if (i != 2) {
            System.out.print(", ");
          }
          break;
        default:
          results[i] = 1;
          System.out.print("Seven");
          if (i != 2) {
            System.out.print(", ");
          }
          break;
      }

    }

    int reward1 = 0;
    if (results[0] == results[1] && results[2] == results[1]) {

      switch (results[0]) {
        case 0:
          reward1 = 20;
          break;
        case 1:
          reward1 = 30;
          break;
        case 2:
          reward1 = 40;
          break;
        default:
          reward1 = 100;
          break;
      }
    }
    System.out.println();
    System.out.print("Reward: ");
    System.out.println(reward1);
    System.out.print("Balance: ");
    System.out.println(balance + reward1);
  }
  
  /*  public void play() {
    this.balance -= 5;
    Symbol[] symbols = new Symbol[3];
    for (int i = 0; i < 3; i++) {
      //int rand = (int)Math.random() * 3;
      
      Random random = new Random();
      int rand = random.nextInt(4);
      if (rand == 0) {
        //Symbol symbol = new Cherry();
        symbols[i] = new Cherry();
        System.out.print(symbols[i].getName());
        //symbols[i] = symbol;
      } else if (rand == 1) {
        //Symbol symbol = new Watermelon();
        symbols[i] = new Watermelon();
        System.out.print(symbols[i].getName());
        //symbols[i] = symbol;
      } else if (rand == 2) {
        //Symbol symbol = new Lemon();
        symbols[i] = new Lemon();
        System.out.print(symbols[i].getName());
        //symbols[i] = symbol;
      } else if (rand == 3) {
        //Symbol symbol = new Seven();
        symbols[i] = new Seven();
        System.out.print(symbols[i].getName());
        //symbols[i] = symbol;
      }
      if (i < 2) {
        System.out.print(", ");
      }
    }
    if (symbols[0].name.equals(symbols[1].name) && symbols[0].name.equals(symbols[2].name)) {
      this.balance += symbols[0].getValue();
      System.out.println();
      System.out.println("Reward: " + symbols[0].getValue());
      System.out.print("Balance: " + this.balance);
    } else {
      System.out.println();
      System.out.println("Reward: 0");
      System.out.print("Balance: " + this.balance);
    }
  }*/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

}
