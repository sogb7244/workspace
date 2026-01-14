import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    int max, mid, min;

    System.out.println("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.println("두번째 수 : ");
    int b = sc.nextInt();
    System.out.println("세번째 수 : ");
    int c = sc.nextInt();

    //a가 가장 큰 경우..
    if(a > b && a > c){
      max = a;
      mid = b > c ? b : c;
      min = b > c ? c : b;
    }
    //b가 가장 큰 경우..
    else if(b > a && b > c){
      max = b;
      mid = a > c ? a : c;
      min = a < c ? c : a;
    }
    //c가 가장 큰 경우..
    else{
      max = c;
      mid = a > b ? a : b;
      min = a < b ? b : a;
    }



    System.out.println(max + ">" + mid + ">"+ min);
  }
}
