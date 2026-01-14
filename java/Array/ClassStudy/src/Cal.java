public class Cal {
  int a;
  int b;
  String c;

  //모든 변수의 값을 변경하는 메서드
  public void setData(int a, int b, String c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  //연산결과를 출력하는 메서드
  public void printResult() {
    //연산자를 잘못 입력했으면 메서드 실행 중지
    if (!(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"))) {
      return;
    }
    System.out.print(a + " " + c + " " + b + " = ");

    switch (c) {
      case "+":
        System.out.println(a + b);
        break;
      case "-":
        System.out.println(a - b);
        break;
      case "*":
        System.out.println(a * b);
        break;
      case "/":
        System.out.println((double) a / b);
        break;

    }

    //매개변수로 전달된 데이터가 짝수일 때만 출력

  }
}
