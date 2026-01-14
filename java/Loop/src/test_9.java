import java.util.Scanner;

public class test_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 수 : ");
    int num1 = sc.nextInt();
    System.out.println("두번째 수 : ");
    int num2 = sc.nextInt();;

    int max = num1 > num2 ? num1 : num2;
    int min = num1 > num2 ? num2 : num1;

    int sum = 0;
    for(int i = min +1; i < max; i++){
      sum = sum +1;
    }
    System.out.println(sum);
  }
}
