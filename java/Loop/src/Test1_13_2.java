public class Test1_13_2 {
  public static void main(String[] args) {

    int i = 1;
    int sum = 0;
    while (true){
      sum = sum + i;
      if (sum > 300){
      break;
      }

      i++;

      //sum이 300을 넘기면 멈추세요!



    }
    System.out.println(sum);
    System.out.println(i);
  }
}
