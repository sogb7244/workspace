import java.util.Scanner;

public class Test1_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a+b > 50){
      System.out.println("두 수의 합이 50보다 큽니다");
    }
    else if(a+b < 50){
      System.out.println("두 수의 합이 50이하 입니다");
    }
  }
}
