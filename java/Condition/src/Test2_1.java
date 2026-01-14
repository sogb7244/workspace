import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    if (num2 + num3 > num && num3 + num > num2 && num + num2 > num3 ){
      System.out.println("가능");
      }
    else{
      System.out.println("불가능");
    }


  }
}
