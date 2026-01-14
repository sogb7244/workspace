import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num; // 키보드로 입력받은 데이터를 저장할 변수
    int clapCnt = 0; // 박수의 개수

    //1. 1~99 사이의 정수 하나를 키보드로 입력받음
    System.out.println("199 사이의 정수를 입력하시오>>");
    num = sc.nextInt();

    //2. 박수 짝, 박수 짝짝인지 확인
    //2-1. 일의 자리의 수와 십의 자리의 수를 분리
    int tens = num / 10;
    int ones = num % 10;

    //2-2. 십의 자리의 수가 3,6,9인지 확인 -> 박수 갯수를 1증가
    //if (tens == 3 || tens == 6 || tens == 9){
    if (tens % 3 == 0 && tens != 0) {
      clapCnt++;
    }
    //      clapCnt = clapCnt +1;
//      clapCnt++;
//      ++clapCnt;
//      clapCnt += 1;


    //2-3. 일의 자리의 수가 3,6,9인지 확인 -> 박수 갯수를 1증가
    if (ones % 3 == 0 && ones != 0) {
      clapCnt++;
    }
    //3. 박수의 갯수에 따라 박수를 친다.
    switch (clapCnt){
      case 0 :
      case 1 :
        System.out.println("박수짝");
        break;
      case 2 :
        System.out.println("박수짝짝");
        break;
    }

  }
}
