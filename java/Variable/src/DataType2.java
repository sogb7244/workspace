public class DataType2 {
  public static void main(String[] args) {

    //변수 선언 시 주의
    //정수를 사용하면 자바는 기본적으로 int 타입으로 해석함
    //실수를 사용하면 자바는 기본적으로 double 타입으로 해석함
    float num1 = 10.5f;
    float num2 = 10.5F;

    long num3 = 10000000000L;

    //정수와 실수의 연산 결과
    //정수끼리의 연산결과는 무조건 정수가 나옴!
    //실수가 연산에 포함되어있으면 결과는 실수로 나옴!
    System.out.println(10.0/3);
    System.out.println(2 + 3 / 2 - 1.0);

  }
}
