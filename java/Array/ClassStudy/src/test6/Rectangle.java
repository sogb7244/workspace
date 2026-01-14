package test6;

import java.security.PublicKey;

public class Rectangle {

  private int x1;
  private int x2;
  private int y1;
  private int y2;

  public Rectangle() {

  }

  public Rectangle(int x1, int x2, int y1, int y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  public void set(int x1, int x2, int y1, int y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  public int square() {
    return (x1 - x2) * (y1 - y2);
  }

  public void show() {
    System.out.println(square());
    System.out.println("좌표 : (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
  }

  //사각형의 넓이가 같으면 return true
  public boolean equals(Rectangle r) {
    return square() == r.square();

  }
}
