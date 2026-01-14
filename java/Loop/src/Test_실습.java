public class Test_실습 {
  public static void main(String[] args) {

//    1. 1부터 10까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요. (continue 사용)
    for (int i =1; i <11; i++){
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);

    }

  }
}
