import java.util.Scanner;

public class Test6_44 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a,b;


    String cal;
    System.out.println("-결과예시 (1) -");
    System.out.println("첫번째 수 : ");
    a = sc.nextInt();
    System.out.println("두번째 수 : ");
    b = sc.nextInt();
    System.out.print("연산자");
    cal = sc.next();

    switch(cal){

      case "+" :
        System.out.println(a + "*" + b+"="+ (a+b));
        break;
      case "-" :
        System.out.println(a + "-" + b+"="+ (a-b));
        break;
      case "*" :
        System.out.println(a + "*" + b+"="+ (a*b));
        break;
      case "/" :
        System.out.println(a + "/" + b+"="+ (a/(double)b));
        break;
      default:
        System.out.println("연산자를 잘못 입력하였습니다.");



    }

  }
}
