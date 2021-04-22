package fcu.iecs.q2;

public class Bank {
  private Account[] accounts = new Account[10];

  /**
   * createAccount.
   */
  public boolean createAccount(String personId) {
    Account account = new Account();// 1. 建立一個新帳號(Account)物件
    account.setPersonId(personId);
    account.setBalance(100);// 2. 新的Account物件其balance的值為100
    int tmp = 0;
    for (tmp = 0; tmp < 10; tmp++) {
      if (accounts[tmp] == null) {
        accounts[tmp] = account;
        break;
      }
    }
    if (tmp >= 10) {
      return false;
    } else {
      return true;
    }
    // 3. 加到accounts array中
    // 4. 當超過array長度時，則回傳false，否則回傳true

  }
  
  /**
   * withdraw.
   */
  public float withdraw(String personId, float money) {
    int update = 0;
    for (int i = 0; i < 10;i++) { // 1. 從accounts中找到同personId的Account物件
      if (accounts[i].getPersonId() == personId) { // 2. 從該物件的balance減到提款的金額，即money
        accounts[i].setBalance(accounts[i].getBalance() - money);
        update = i;
        break;
      }
    }
    if (accounts[update].getBalance() < 0) {
      // 3. 回傳更新後的balance值
      // 4. 若更新後的balance值小於0，則回傳-1
      System.out.print(accounts[update].getBalance() + update);
      return -1; 
    } else {
      return accounts[update].getBalance();
    }
  }
  
  /**
   * deposit.
   */
  public float deposit(String personId, float money) {
    int update = 0;
    for (int i = 0; i < 10;i++) { // 1. 從accounts中找到同personId的Account物件
      if (accounts[i].getPersonId() == personId) { // 2. 更新該物件的balance的值，即加上存款的金額(money)
        accounts[i].setBalance(money + accounts[i].getBalance());
        update = i;
        break;
      }
    }
    return accounts[update].getBalance();// 3. 回傳更新後的balance值
  }

  public Account[] getAccounts() {
    return accounts;// 1. 回傳accounts
    // 2. 注意外部只能讀此Bank物件中所有的Account，但無法修改
  }

}
