public class For문 {
  public static void main(String[] args) {

  for (int a = 0; a<= 4; a++){
    System.out.println("*");
  }
    System.out.println();
  for (int b = 0; b <=5; b++){
      System.out.println(b);
    }
    System.out.println();
  for (int c = 1; c <=5; c++){
    System.out.println(c*2);
  }
    System.out.println();
  for (int d = 10 ; d >= 0; d--){
      System.out.println(d);
    }
    System.out.println();
 int cnt1 = 0;
    for(int g = 1;g < 101; g++){
      if(g % 3 == 0){
        cnt1 ++;
        System.out.println(cnt1);
      }

      g++;
    }
    System.out.println();

  }

  }

