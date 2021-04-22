package fcu.oop.h2;

public class Account {
  private String name;
  private String account;
  private String password;
  private double balance;
  final double interestRate = 0.0155;
  
  
  public Account() {

  }
  
  public Account(String name) {
    this.name = name;
  }

  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAccount() {
    return account;
  }
  
  /**
   * setAccount.
   */
  public void setAccount(String account) {
    String regex = "^\\w{1,63}@[a-zA-Z0-9]{2,63}\\.[a-zA-Z]{2,63}(\\.[a-zA-Z]{2,63})?$";
    if (account.matches(regex)) {
      this.account = account;
    } else {
      this.account = null;
    }
  }
  
  public String getPassword() {
    return password;
  }
  
  /**
   * setPassword.
   */
  public void setPassword(String password) {
    if (password.matches("(?=.?[0-9])(?=.?[A-Z])[A-Za-z0-9]*")) {
      this.password = password;
    } else {
      this.password = null;
    }
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public double getInterest() {
    double interest = this.balance * interestRate;
    return interest;
  }
  
  public double deposite(int deposite) {
    this.balance = this.balance + deposite;
    return balance;
  }
  
  public double withdraw(int withdraw) {
    this.balance = this.balance - withdraw;
    return balance;
  }
  
}
