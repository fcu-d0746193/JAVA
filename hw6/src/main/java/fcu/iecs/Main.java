package fcu.iecs;

import java.util.Random;
//import java.util.Scanner;

public class Main {
  /**
   * Main.
   */
  public static void main(String[] args) {
    //建立一個長度為5的Array  (base class: Cake)
    Cake[] cake = new Cake[5];
    //Scanner scan = new Scanner(System.in);
    double sum = 0;
    double sumPrice = 0;
    int quantity = 0;
    double tmp1 = 0;
    double tmp2 = 0;
    double max = 0;
    
    for (int i = 0; i < 5; i++) {
      //String name = scan.next();
      //double rate = scan.nextDouble();
      //double value = scan.nextDouble();
      //隨機生成五個Cake物件(可以是OrderCake或ReadyMadeCake)，並放入Cake Array中]
      Random ran = new Random();
      int random = ran.nextInt(2);
      switch (random) {
        case 0:
          Cake cake1 = new OrderCake("Amy",1.5,20.5);
          //System.out.println("1");
          tmp1 = cake1.calcPrice();
          sum += cake1.calcPrice();
          cake[i] = cake1;
          break;
        case 1:
          Cake cake2 = new ReadyMadeCake("Tom", 2.5, 30);
          //System.out.println("2");
          tmp2 = cake2.calcPrice();
          sum += cake2.calcPrice();
          sumPrice += cake2.calcPrice();
          quantity += 30;
          cake[i] = cake2;
          break;
        default:
          //System.out.println("Error");
          break;
      }
      if (tmp1 > max) {
        max = tmp1;
      } else if (tmp2 > max) {
        max = tmp2;
      }
    }
    
    System.out.println(sum);
    System.out.println(sumPrice);
    System.out.println(quantity);
    System.out.print(max);
  
    //印出Cake Array中所有Cake物件的總價格
    //印出Cake Array中所有ReadyMadeCake物件的總價格與總量(quantity)
    //印出Cake Array中Cake物件的最高價
    //scan.close();
  }

}
