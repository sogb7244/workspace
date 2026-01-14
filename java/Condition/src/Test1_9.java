import java.util.Scanner;

public class Test1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  int a;
  int b;


    System.out.println("첫번째 수");
    a = sc.nextInt();
    System.out.println("두번째 수");
    b = sc.nextInt();

    int max = a > b ? a : b; //두 수 중 큰 수를 저장
    int min = a > b ? b : a; // 두 수중 작은 수를 저장

    if (a > b)
      System.out.println(a + ">" + b);
    else
      System.out.println(b + ">" + a);

  }
}
