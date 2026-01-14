import java.util.Scanner;

public class CalTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Cal cal1 = new Cal();

    int a = sc.nextInt();
    int b = sc.nextInt();
    String c = sc.next();
    //cal 클래스 객체 생성

    cal1.setData(a,b,c);
    cal1.printResult();

  }

}
