package fcu.oop.h1;

public class BmiCalculator {
  public static double getBmi(double weight, double height) {
    double bmi = weight / (height * height);
    return bmi;
  }
  
  /**
   * String.
   */
  public static String getBmi(String weight, String height) {
    double weightd = Double.parseDouble(weight);
    double heightd = Double.parseDouble(height);
    String bmi = String.valueOf(getBmi(weightd,heightd));
    return bmi;
  }
}
