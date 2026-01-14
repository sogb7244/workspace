import java.util.Scanner;

public class 성적 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("-결과-");
    int KorScore = sc.nextInt();
    System.out.print("국어점수 : " + KorScore);

    int eng = sc.nextInt();
    System.out.print("영어점수 : " + eng);

    int math = sc.nextInt();
    System.out.println("수학점수 : " + math);
    //총점 및 평균
    int total = KorScore + eng + math;
    System.out.print("총점 : ");
    System.out.println(total);

    System.out.print("평균 : ");
    double mid = (double) total / 3.0;
    //결과 출력
    System.out.println(mid);

  }
}
