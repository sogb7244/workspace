import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();


    if (a % 2 == 0) {
      System.out.println("짝수입니다");
    } else if (a % 2 != 0) {

      System.out.println("홀수입니다");
    } else if (a == 0) {
      System.out.println("0입니다");

    }
    System.out.println(a % 2 == 0 ? "짝수":"홀수");
    //삼항연산자 :  if else문을 대체해서 사용!
    //  조건? 참일 때 실행 코드 : 거짓일 때 실행 코드;
    int num = 10 > 3 ?  5 : 10;

  }
}
