package test7;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Test7Test {
  public static void main(String[] args) {

    Sub sb = new Sub();
    Add ad = new Add();
    Mul ml = new Mul();
    Div dv = new Div();
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    String c = sc.next();


    if (c.equals("-")){
      sb.setValue(a,b);
      System.out.println(sb.calculate());
    }
    else if( c.equals("+")){
      ad.setValue(a,b);
      System.out.println(ad.calculate());
    }


    else{
      System.out.println("연산자잘못입력했습니다");
    }


  }
}

