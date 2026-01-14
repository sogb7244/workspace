package static_study;

public class Bank {
  private String owner;
  private int money;

  //static 변수는 생성자에서 초기화하면 안 됨!
  //static 변수를 초기화하기 위한 별도의 문법이 존재!
  static double rate; // 이율

  //static 변수의 초기화 구문
  static{
    rate = 7.0;
  }

  public Bank(){
    money=10000;
    rate = 7.0;

  }
}
