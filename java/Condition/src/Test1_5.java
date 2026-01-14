

import java.util.Scanner;

public class Test1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    String grade = "";

    num = sc.nextInt();



    if(num >= 90 && num <= 100){
      grade = "A";
    }
    else if(num > 80 && num <= 90) {
      grade = "b";
    }
    else if( num <= 80){
        grade = "c";
      }
    System.out.println("학점은 " + grade + "입니다");
    }

  }
