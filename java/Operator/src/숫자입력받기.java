import java.util.Scanner;

public class 숫자입력받기 {
  public static void main(String[] args) {
    //키보드 입력을 위한 객체 생성
    Scanner sc = new Scanner(System.in);

    System.out.println("키를 입력하세요 : ");
    int height = sc.nextInt();
    System.out.println("키 - " + height);

    System.out.println("몸무게를 입력하세요 : ");
    double weight = sc.nextDouble();
    System.out.println("입력 받은 몸무게 - " + weight);

  }
}
