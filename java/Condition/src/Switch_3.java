public class Switch_3 {
  public static void main(String[] args) {
    //스코어가 90이상 100이하 a 출력
    //스코어가 80이상 89이하 b 출력
    //스코어가 70이상 79이하 c 출력
    //스코어가 60이상 69이하 d 출력
    //switch case break으로 코드 작성
    int score = 87;
    String grade = "";

    switch (score / 10) {
      case 10:
      case 9:
        grade = "A";
        break;

      case 8 :
        grade = "B";
        break;
      case 7:
        grade = "C";
        break;
      default:
        grade = "D";

    }
  }
}