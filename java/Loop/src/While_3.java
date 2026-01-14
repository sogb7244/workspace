public class While_3 {
  public static void main(String[] args) {
    //1부터 10까지의 합을 출력
    int num = 1;
    int sum = 0; //1~10까지의 합을 저장할 변수


    while(num < 6){
      sum = sum + num;
      num++;
      System.out.println(sum);

    }



  }
}
