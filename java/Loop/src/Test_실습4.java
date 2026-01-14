public class Test_실습4 {
  public static void main(String[] args) {

    int a = 0;
    int b = 0;

//
//    for (a = 1; b > 50; a++) {
//      b = a + b;
//      if (b > 50) {
//        break;
//
//      }
//
//      System.out.println((b += a) + a);

//    }
    while (true) {
      b = b +a;
      if (b > 50) {
        break;
      }

      a++;


    }
    System.out.println(b = b+a);
    System.out.println((b = b+a) + a);
  }
}