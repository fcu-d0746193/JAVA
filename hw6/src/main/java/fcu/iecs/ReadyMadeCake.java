package fcu.iecs;

public class ReadyMadeCake extends Cake {
  int quantity;
  
  public ReadyMadeCake(String name, double rate, int quantity) {
    super(name,rate);
    this.quantity = quantity;
  }
  
  public double calcPrice() {
    double rate = getRate();
    return rate * this.quantity;
  }

}
