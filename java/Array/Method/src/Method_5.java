public class Method_5 {
  public static void main(String[] args) {
    int a =test2(11,22);//30
    System.out.println(a);

    String result = test3("홍길동");
    System.out.println(result);
    System.out.println(test3("홍길동"));

  }


  //매개변수로 전달된 문자열 뒤에 "님"을 더하여 리턴하는 메서드
  public static String test3(String name){
    return name + "님";
  }

  //매개변수로 전달된 두 정수의 합을 출력하는 메서드
  public static void test1(int a, int b){
    System.out.println(a+b);
  }

  //매개변수로 전달된 두 정수의 합을 리턴하는 메서드
  //리턴 :
  // - 결과를 개발자한테 돌려준다 ㅋ
  public static int test2(int a,int b){

    return a+b;

  }
}
