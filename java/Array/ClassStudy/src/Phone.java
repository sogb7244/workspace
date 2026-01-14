//휴대폰 객체 생성을 위한 설계도
//클래스의 구성 요소
//1. 변수(맴버변수, 필드)
// 지금까지 선언한 변수(메서드 안에서 선언한 변수)는 지역변수(local variable)라 부른다
// 지역변수는 반드시 초기화가 필요!, 멤버변수는 자동으로 초기화 진행
//2. 메서드의 정의
//3. 생성자
public class Phone {
  int price; //가격
  String modelName; //모델명
  String brand; // 브랜드

  //문자 보내는 기능
  //접근제한자 리턴타입 메서드명
  public void sendSms(String msg){
    int age;

    System.out.println("문자를 보냅니다 : " +msg);
  }

  //전화하기 기능
  public void call(String sender){
    System.out.println(sender + "님으로부터 전화가 왔다.");
  }
}
