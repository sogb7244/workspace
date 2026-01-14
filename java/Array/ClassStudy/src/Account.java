//좋은 클래스는 초기값을 명시하는 것이 좋다.
//좋은 클래스는 멤버의 초기값을 선언과 동시에 하지 않는다.
// -> 멤버변수의 값을 초기화 할 수 있는 기능(메서드)을 만들자
// 1.초기화 이전에 다른 코드를 실행해도 오류가 발생 x
// 2.메서드로 초기화 기능을 만드렁 놓으면 초기화를 강제화 할 수 있다.
// 이 문제를 해결하기 위해 사용하는 문법 : 생성자(Constructor)
// 생성자
// 1. 생성자 이름은 반드시 클래스 명과 동일해야함
// 2. 생성자 안에서는 주로 멤버변수의 값을 초기화하는 코드르 작성한다
// 3. 만약 클래스 안에 선언된 생성자가 없다면 기본 생성자가 내부적으로 만들어진다
//    기본생성자 : 매겨번수가 없고, 실행 내용도 없느 생성자
//       -> public Account(){}
// 4. 생성자는 필요에 따라 여러개 선언할 수 있음
//       -> 이때 반드시 매개변수 정보(매개변수의 갯수,매개변수의 자료형)는 달라야 함
//       -> 이것을 생성자 오버로딩이라 함
public class Account {
  String owner = null; //계좌주
  int money; //예금액
  String accNumber; //계좌번호 111-1112

  //생성자
  public Account(){
    owner = "";
    money = 50000;
    accNumber = "미정";
  }

  //멤버변수의 값을 초기화하는 메서드
  public void initAcc(){
    owner = "";
    money = 50000;
    accNumber = "미정";
  }
  public void printAccInfo(){
    System.out.println("계좌주 : " + owner);
    System.out.println("예금액 : " + money);
    System.out.println("계좌번호 : " + accNumber);
  }

}
