package fcu.iecs.q2;

public class Bank {
  private Account[] accounts = new Account[10];

  /**
   * createAccount.
   */
  public boolean createAccount(String personId) {
    Account account = new Account();// 1. �إߤ@�ӷs�b��(Account)����
    account.setPersonId(personId);
    account.setBalance(100);// 2. �s��Account�����balance���Ȭ�100
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
    // 3. �[��accounts array��
    // 4. ��W�Larray���׮ɡA�h�^��false�A�_�h�^��true

  }
  
  /**
   * withdraw.
   */
  public float withdraw(String personId, float money) {
    int update = 0;
    for (int i = 0; i < 10;i++) { // 1. �qaccounts�����PpersonId��Account����
      if (accounts[i].getPersonId() == personId) { // 2. �q�Ӫ���balance��촣�ڪ����B�A�Ymoney
        accounts[i].setBalance(accounts[i].getBalance() - money);
        update = i;
        break;
      }
    }
    if (accounts[update].getBalance() < 0) {
      // 3. �^�ǧ�s�᪺balance��
      // 4. �Y��s�᪺balance�Ȥp��0�A�h�^��-1
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
    for (int i = 0; i < 10;i++) { // 1. �qaccounts�����PpersonId��Account����
      if (accounts[i].getPersonId() == personId) { // 2. ��s�Ӫ���balance���ȡA�Y�[�W�s�ڪ����B(money)
        accounts[i].setBalance(money + accounts[i].getBalance());
        update = i;
        break;
      }
    }
    return accounts[update].getBalance();// 3. �^�ǧ�s�᪺balance��
  }

  public Account[] getAccounts() {
    return accounts;// 1. �^��accounts
    // 2. �`�N�~���u��Ū��Bank���󤤩Ҧ���Account�A���L�k�ק�
  }

}
