package fcu.iecs.oop.tiida;

public class NissanTiida {
  int looptime;
  /**
   * print stars.
   */

  public void tiida() {
    looptime++;
    for (int j = looptime; j > 0; j--) {
      for (int k = looptime; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
