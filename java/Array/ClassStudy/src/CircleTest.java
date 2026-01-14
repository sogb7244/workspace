public class CircleTest {
  public static void main(String[] args) {

    Circle c = new Circle();
    //멤버변수의 값에 직접 접근하는 것은 지양!
    //잘못된 데이터가 들어가는 것을 막을 수 없기 때문
    //    c.r = 10.5;


    //멤버변수의 값을 변경할 때는 setter를 활용
    c.setR(10.5);

    System.out.println(c.getSize());

  }
}
