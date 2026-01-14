public class Print2 {
  public static void main(String[] agrs){

    //출력문 안의 내용이 연산 가능하면 연산 결과를 출력
    //문자열에 대한 연산은 더하기만 가능(*, -, / 등은 불가)
    System.out.println(10+20);
    System.out.println("10+20");

    //자바는 문자열끼리의 합이 계산됨. -> 문자열의 나열
    System.out.println("10"+"20");
    //더하기에 문자열에 포함되면 결과는 문자열의 나열
    System.out.println(10+"20");

    System.out.println(10+20+"30");


  }
}
