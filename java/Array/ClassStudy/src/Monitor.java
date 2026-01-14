public class Monitor {
  String modelName;
  int price;
  double inch;

  public Monitor(){

  }
  public Monitor(String a){

  }
  public Monitor(int price,String a){

  }
  //생성자
  public Monitor(int price){
    this.modelName = null;
    this.price = price;
    inch = 0.0;
  }

  //메서드 오버로딩
  //메서드의 매개변수의 갯수, 매개변수의 자료형이 다르면 메서드명 중복 선언 가능!
  public void aa(){

  }
  public void aa(int a){

  }
  public void aa(String a){

  }
  //매개변수를 출력하는 메서드 정의
}
