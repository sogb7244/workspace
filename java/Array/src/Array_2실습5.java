import java.util.Arrays;

public class Array_2실습5 {
  public static void main(String[] args) {

    int[] a = new int[6];

    for (int i = 0; i < a.length; i++) {
      int b = (int) (Math.random() * 45 + 1);
      //0.0 <= x < 1.0실수
      a[i] = b;
    }
    //로또 번호 출력


      System.out.println(Arrays.toString(a));


  }
}
