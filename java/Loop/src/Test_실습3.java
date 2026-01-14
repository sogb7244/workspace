public class Test_실습3 {
  public static void main(String[] args) {
    int a = 1;
    int sum = 0;
    for (a = 1; a < 21;  a++){

      if (a % 3 == 0){
        continue;
      }
      sum = sum +a;
      System.out.println(sum);
    }

  }
}
