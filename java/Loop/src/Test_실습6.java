import com.sun.source.tree.IfTree;

public class Test_실습6 {
  public static void main(String[] args) {


    //소수 = 1과 자신으로만 나누어 떨어지는 수.
    for (int i = 2 ; i <31 ; i++){

      int cnt =0;
      //i가 소수면 출력하세요
      for (int j = 1; j < i+1; j ++){
      if (i  % j == 0){
        cnt ++;
       if (cnt > 2){
         break;//가장 가까운 반복문 벗어남.
       }
      }
      }
      if(cnt == 2){
        System.out.println(i);
      }
    }



  }
}
