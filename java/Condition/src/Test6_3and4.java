import java.util.Scanner;

public class Test6_3and4 {
  public static void main(String[] args) {
    //키보드 입력을 위해 선언
    Scanner sc = new Scanner(System.in);
    //키보드로 입력받은 두 정수를 저장할 변수
    int a, b;
    String cal;


    System.out.println("-결과예시 (1)-");

    System.out.println("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.println("두 번째 수 : ");
    b = sc.nextInt();
    System.out.println("연산자");
    cal = sc.next();


    if (cal.equals("*")){
      System.out.println(a + "*" + b+"="+ (a*b));
    }
    else if(cal.equals("+")) {
      System.out.println(a + "+" + b + "=" + (a + b));
    }

    else if(cal.equals("/")) {
      System.out.println(a + "/" + b + "=" + (a / (double)b));
    }
    else if(cal.equals("-")) {
      System.out.println(a + "-" + b + "=" + (a - b));
    }
    else{
      System.out.println("연산자를 잘못 입력하엿습니다.");
    }

  }
}
