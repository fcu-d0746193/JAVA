package fcu.iecs.oop.password;

public class PasswordEncoder {
  /**
   *change word in a strings use repalceAll method.
   */

  public String encode(String password) {
    password = password.replaceAll("(?i)A", "4");
    password = password.replaceAll("(?i)E", "3");
    password = password.replaceAll("(?i)I", "1");
    password = password.replaceAll("(?i)O", "0");
    password = password.replaceAll("(?i)T", "7");
    return password;
  }
}
