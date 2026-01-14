import java.util.Scanner;

public class Test1_3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

   int a,b;

    System.out.println("첫번째 수 : ");
    a = sc.nextInt();
    System.out.println("두번째 수 : ");
    b = sc.nextInt();
    if(a > b){
      System.out.println("a");
    }
    else if(b>a){
      System.out.println("b");
    }
    else {
      System.out.println("같다");
    }
    System.out.println( a>b ? "a" : b> a ? "b" : "같다");
  }
}
