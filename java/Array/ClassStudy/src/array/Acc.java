package array;

public class Acc {
  private String owner;
  private String accNumber;
  private int balance; //예금액

  public Acc() {
    this.owner = "확인안됨";
    this.accNumber = "미정";
    this.balance = 0;
  }
  public Acc(String owner, String accNumber, int balance) {
    this.owner = owner;
    this.accNumber = accNumber;
    this.balance = balance;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getAccNumber() {
    return accNumber;
  }

  public void setAccNumber(String accNumber) {
    this.accNumber = accNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Acc{" +
            "owner='" + owner + '\'' +
            ", accNumber='" + accNumber + '\'' +
            ", balance=" + balance +
            '}';
  }
}
