import java.util.Arrays;

public class Array_2실습7 {
  public static void main(String[] args) {

    int[] a = new int[10];


    for (int i = 0; i<a.length;i++){
      a[i] = (int)(Math.random()*100+1);
    }
    System.out.println(Arrays.toString(a));
    //최대, 최소값을 저장
    int max = a[0];
    int min = a[0];

    for (int i = 1; i<a.length;i++) {
      if (max < a[i]) {
        max = a[i];
      }

      if (min > a[i]) {
        min = a[i];
        }

      }

    System.out.println("max = " + max);
    System.out.println("min = " + min);




  }
}