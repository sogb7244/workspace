import java.util.Scanner;

public class 문자열입력받기 {
  public static void main(String[] args) {
  //키보드 입력을 위한 객체 생성(초보자는 반드시 자동완성으로 작성할 것)
    Scanner sc = new Scanner(System.in);

    System.out.println("이름을 입력하세요 : ");
    //sc.next() -> 키보드로 문자열을 입력받는 명령어
    String name = sc.next();
    System.out.println("입력받은 이름 - " +name);

  }
}
