public class Switch_1 {
  public static void main(String[] args) {
    int num = 2;

    //스위치문은 조건이 일치하는 위치에서 위치부터 코드를 실행
    switch (num){
      case 1:
        System.out.println(1);
        System.out.println(1);
        break; //break 실행 후 해석 종료
      case 2:
        System.out.println(2);
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        System.out.println(3);
        break;
      default: //위 케이스 말고 나머지 경우에는
        System.out.println(4);
    }
  }


}
