import java.util.Scanner;

public class if_2 {
  public static void main(String[] args) {
    //키보드를 정수를 하나 입력받아
    //입력받은 정수가 3보다 클 때만 '정답'이라는 문자열을 출력하는 프로그램

    Scanner sc = new Scanner(System.in);

    //정수입력 받기
    System.out.print("정수입력 : ");
    int data = sc.nextInt();
    //입력정보 정수가 짝수라면..
    if(data % 2 == 0){
      System.out.println("정답");

    }

  }
}
