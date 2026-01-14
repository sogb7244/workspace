import java.util.Scanner;

public class Array_실습10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    int[] a = new int[5];
    //배열의 크기만큼 키보드로 입력받아 저장
    int i ;

    for (i = 0; i < a.length; i++) {
      System.out.print(i + " 요소입력 : ");
      a[i] = sc.nextInt();

    }
    //배열 요소 확인
    System.out.println("===배열의 모든 요소===");
    for (i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");


    }

  }
}
