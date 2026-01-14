package board;

//하나의 게시글 정보를 표현하는 클래스
public class Board {
  private int boardNum;
  private String title;
  private String writer;
  private int readCnt; //조회수

  //생성자
  public Board(int boardNum, String title, String writer, int readCnt) {
    this.boardNum = boardNum;
    this.title = title;
    this.writer = writer;
    this.readCnt = readCnt;
  }
  //setter,getter
  public int getBoardNum() {
    return boardNum;
  }

  public void setBoardNum(int boardNum) {
    this.boardNum = boardNum;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getReadCnt() {
    return readCnt;
  }

  public void setReadCnt(int readCnt) {
    this.readCnt = readCnt;
  }
  //toString
  @Override
  public String toString() {
    return "Board{" +
            "boardNum=" + boardNum +
            ", title='" + title + '\'' +
            ", writer='" + writer + '\'' +
            ", readCnt=" + readCnt +
            '}';
  }
}
