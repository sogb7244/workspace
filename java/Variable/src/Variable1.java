public class Variable1 {
  public static void main(String[] args){
    //변수의 선언 : 하나의 데이터를 저장할 공간을 정의한다.
    //변수 선언 문법 → 자료형(Data Type) 변수;

    //int : 정수 자료형(Integer)
    //정수 하나를 저장할 수 있는 변수 num을 선언
    int num;

    //개발에서 '='는 같다라는 의미가 아니다
    //'=' 해석은 우측값을 왼쪽에 저장한다(할당한다)
    //변수 선언 후 최초로 값을 저장하는 것을 '변수의 초기화'라고 얘기한다.
    num = 5; //변수의 초기화
    num = 10; //변수의 초기화 아님

    //num이라는 변수에 저장한 값을 출력
    //출력문 안의 문자열이 쌍따옴표에 감싸져 있지 않다면 문자열이 아니라 변수를 의미함.
    System.out.println(num);
    System.out.println(num); //num이라는 문자열을 출력
    System.out.println("num= " +num);
  }

}
