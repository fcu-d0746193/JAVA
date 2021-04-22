package fcu.iecs;

public class OrderCake extends Cake {
  double weight;
  
  public OrderCake(String name, double rate, double weight) {
    super(name, rate);
    this.weight = weight;
  }
  
  public double calcPrice() {
    double rate = getRate();
    return rate * this.weight;
  }


}
