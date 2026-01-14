public class Variable4 {
  public static void main(String[] args) {

    int a = 10;
    int b = 20;
    System.out.println("===바뀌기 전 ===");
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    //아래에 두 변수의 값을 스위칭하는 코드를 작성

    int c;
    c = a;
    a = b;
    b = c;

    System.out.println("===바뀐 후 ===");
    System.out.println("a = "+a);
    System.out.println("b = "+b);

  }
}