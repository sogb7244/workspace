import com.sun.jdi.Value;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Method_실습 {
  public static void main(String[] args) {
//    Test1();
//    Test2(20);
//    Test3("awdad");
//    Test4(20, 30, 40);
//    Test5(20, 3);
//    Scanner sc = new Scanner(System.in);
//    System.out.println("8번 문제 매개변수 : ");
//    int a = sc.nextInt();
//    Test6(a);
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//    test7(b, c);
//    test8(39);
//    test9(29, 40);
//    test10(10);
//    test11(5, 10);
//    System.out.println();
//    test12(11, 51);
//    test13("kim", 50);

//    int a = test14(5,6);
//    System.out.println(a);
//    Scanner sc = new Scanner(System.in);
//    System.out.println("2번문제 매개변수 : ");
//
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c =test2(a,b);
//    System.out.println(c);
//  int max = test3(30,29);
//    System.out.println(max);
//    String ca = test4(4,5);
//    System.out.println(ca);
//    String result=test5(99);
//    System.out.println(result);
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    String result =test6(9);
//    System.out.println(result);
//double result= test7(9);
//    System.out.println(result);
//double result = test8(90,80,67);
//    System.out.println(result);
//
//    int result = test9(9);
//    System.out.println(result);
//      String reesult =test10("awwadw");
//    System.out.println(reesult);
//
    //문자열 > 정수
    //interger.parseint("6"); -> 6
    //int a = Interger.pareseint("6");

    //정수 > 문자열
    //String.valueof(6); -> "6"
    //String.valueOf(6);
    //String a = String.valueOf(6);

//    int[] a = {1,5,7,3};
//    int result = test3_6(a);
//
//    System.out.println(result);
 int[] a = {1,2,3,4,5};
 int[] b = test3_9(a);
    System.out.println(Arrays.toString(b));

  }

  public static int[] test3_9(int[] arr) {
    // 배열 크기는 변경 불가!!
    //1. 매개변수로 들어온 배열 요소에서 짝수의 갯수를 구함
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        cnt++;
      }
    }
    //답을 저장할 배열 생성
    int[] resultArr = new int[cnt];
    //답이 들어갈 배열이 인덱스 번호
    int index = 0;
    //매개변수로 전달된 배열 요소중 짝수만 결과 배열에 저장
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 ==0){
        resultArr[index] = arr[i];
        index++;//resultArr[index++] = arr[i];
      }
    }
    return resultArr;
  }

//public static int test3_6(int[] arr){//arr = [1,5,6,3]
//    int max = arr[0];
//    for(int i=0;  i<arr.length; i ++){
//      if (max < arr[i]){
//        max = arr[i];
//      }
//    }
//    return max;
//  }
//
//  public static String test10(String a) {
//    String c;
//    if (a.length() % 2 == 0) {
//      c = "true";
//    } else {
//      c = "false";
//    }
//    return c;
//  }

//  public static int test9(int a){
//
//    int c = 0;
//    int cc = c;
//    for (int i = 1;i<=a ;i++){
//      if (i % 2 ==1){
//        c = c+i;
//      }
//    }
//   return c;
//  }
//
//  public static double test8(int a, int b, int c){
//    double cc = (a + b + c) / (double)3;
//
//            return cc;
//  }


//  public static double test7(double a){
//    double aa = (a*a);
//
//    return aa;
//  }


//  public static String test6(int a) {
//    String c = a+"";
//
//    return c;
//  }



//  public static String test5(int a){
//    String c;
//    if (a >= 90){
//      c = "A";
//    }
//    else if(a >=70){
//      c = "B";
//    }
//    else{
//      c = "C";
//    }
//    return c;
//  }




//  public static String test4(int a, int b){
//    String cc = a+","+b;
//
//    return cc;
//  }

//  public static int test3(int a, int b){
//    int aa = a > b ? a : b;
//            return aa;
//  }


//  public static int test2(int a, int b){
//      int xx = a*b;
//    return xx;
//  }

//  public static void Test1() {
//    System.out.println("안녕하세요");
//
//  }
//
//  public static void Test2(int a) {
//    System.out.println(a);
//  }
//
//  public static void Test3(String a) {
//    System.out.println(a);
//  }
//
//  public static void Test4(int a, int b, int c) {
//    System.out.println(a * b * c);
//  }
//
//  public static void Test5(int a, int b) {
//    System.out.println(a / b);
//    System.out.println(a % b);
//  }
//
//  public static void Test6(int a) {
//  }
//
//  public static void test7(int b, int c) {
//    System.out.println(c + b);
//  }
//
//  public static void test8(int a) {
//    if (a % 2 == 0) {
//      System.out.println("짝수입니다");
//    } else {
//      System.out.println("홀수입니다");
//    }
//    //    System.out.println(num % 0 == 0 ? "짝수입니다" :"홀수입니다");
//  }
//
//  public static void test9(int a, int b) {
//    if (a % 2 == 0 && b % 2 == 0) {
//      System.out.println("두 수는 짝수입니다");
//    } else if (a % 2 == 0 || b % 2 == 0) {
//      System.out.println("한 수만 짝수입니다");
//    } else {
//      System.out.println("두 수는 홀수입니다");
//    }
//  }
//
//  public static void test10(int a) {
//    for (int i = 0; i < a + 1; i++) {
//      System.out.println(i);
//    }
//  }
//
//  public static void test11(int a, int b) {
//    //a,b에서 큰 수와 작은 수를 구분해야함.
//    // int max = a > b ? a : b; // int max = Math.max(a,b);
//    // int min = a > b ? b : a;
//    for (int i = a + 1; a < b; i++) {
//      System.out.println(i);
//      a++;
//    }
//  }
//
//  public static void test12(int a, int b) {
//    int cnt = 0;
//    for (int i = 0; a < b; a++) {
//      i = a + 1;
//      if (i % 5 == 0) cnt++;
//
//    }
//    System.out.println(cnt);
//  }
//
//  public static void test13(String str, int b) {
//    for (int i = 0; i < b; i++) {
//      System.out.println(str);
//    }
//  }




}
