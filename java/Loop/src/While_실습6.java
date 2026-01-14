public class While_실습6 {
  public static void main(String[] args) {

    int a = 1;
    int b = 0;

    while (a < 101) {

      if (a % 3 == 0) {
        b++;

      }
     a++;

    }

    System.out.println(b);
  }
}
