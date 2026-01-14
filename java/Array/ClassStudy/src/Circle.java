//접근제한자 : 맴버변수 및 메서드의 접근 범위를 지정하는 문법
//public > default > protected > private
//private - 멤버변수 및 메서드를 정의한 클래스 내에서만 접근 허용
//protected - 상속의 개념을 알아야 이해 가능
//default - 같은 패키지 내에서 접근 허용(접근제한자를 작성하지 않는 것이 default 접근제한자이다.)
//public - 같은 프로젝트 내에서 접근 허용
//결혼
//맴버변수는 항상 private 접근 제한자를 사용
//메서드의 접근제한자는 일단은 public 씀.
public class Circle {
 private double r;

  //r 값을 변경하는 메서드, setter
  public void setR(double r) {
    if (r < 0) {
      this.r = 0.0;
    } else {
      this.r = r;
    }
  }

  //원의 둘레를 리턴 2파이r
  public double getSize(){
    return 2* Math.PI*r; //Math.PI = 상수
  }
  //원의 넓이를 리턴 파이*rr
  public double getArea(){
    return Math.PI *r*r;
  }


}
