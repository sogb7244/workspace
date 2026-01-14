import java.util.Arrays;
import java.util.Scanner;

public class Array_2실습11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //0:국어, 1:영어 2:수학 3:총점
    int[] scores = new int[4];
    String[] subjects = {"국어", "영어", "수학"};
    double avg;  //평균

    //과목 수만큼 반복
    for (int i = 0; i < scores.length - 1; i++) {
      //한 과목 점수 입력
      while (true) {
        System.out.print(subjects[i] + "점수(0~100) : ");
        scores[i] = sc.nextInt();
        if (scores[i] >= 0 && scores[i] <= 100) {
          break;
        }
      }
    }
    //총점 및 평균 계산
    for (int i = 0; i < scores.length - 1; i++) {
      scores[scores.length - 1] = scores[scores.length - 1] + scores[i];

    }
    avg =
            scores[scores.length - 1] / (double) (scores.length - 1);

    //성적 정보 출력
    for (int i = 0; i < scores.length - 1; i++) {
      System.out.println(subjects[i]+"점수 - " + scores[i]);
    }
    System.out.println("총점 - " + scores[scores.length-1] );
    System.out.println("평균 - " + avg);
  }
}