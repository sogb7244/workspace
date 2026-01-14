package board;

public class BoardTest {
  public static void main(String[] args) {

    //자료형이 다른 데이터는 저장 불가!
    Board b1 = new Board(1, "first","kim",5);
    Board b2 = b1;

    System.out.println(b1);
    System.out.println(b2);

    b1.setTitle("변경된 제목");
    System.out.println(b1);
    System.out.println(b2);
  }
}
