public class Method_4 {
  public static void main(String[] args) {
    printsum(20,30);
    printInfo("gㅐㅎo",12);
  }
  //매개변수로 전달된 이름과 나이를 출력하는 메서드
  public static  void printInfo(String name,int age){
    System.out.println(name);
    System.out.println(age);
  }


  //매개변수로 들어온 두 정수의 합을 출력하는 메서드
  public static  void printsum(int a, int b){
    //int a = 20;
    //int b = 30;
    System.out.println(a+b);
  }

}
