package array;

import com.sun.source.tree.IfTree;

public class AccTest1 {
  public static void main(String[] args) {

    //계좌를 3개 저장할 수 있는 배열 arr을 생성
    //계좌를 3개 만든게 아니라, 계좌가 3개 저장될 수 있는 공간을 만듦
    Acc[] arr = new Acc[3];
    System.out.println(arr[0]);
    //arr 배열에 acc 정보를 저장
    //1. 계좌 정보 생성
    Acc a1 = new Acc("kim", "1111", 10000);
    Acc a2 = new Acc("Lee", "2211", 20000);
    Acc a3 = new Acc("Hong", "3311", 30000);
    //2. 배열에 생성한 계좌 정보를 저장
    arr[0] = a1;
    arr[1] = a2;
    arr[2] = a3;
    //문제1. 배열의 0번째 요소에 저장한 계좌의 예금액을 출력

    System.out.println(arr[0].getBalance());
    //문제2.배열의 1번 요소가 저장된 계좌의 모든 정보 출력
    System.out.println(arr[0].toString());
    //문제3.배열에 저장된 모든 계좌의 예금액 합을 출력
    int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//      sum = sum + arr[i].getBalance();
//    }

    for(Acc e : arr) {
      System.out.println(sum = sum+e.getBalance());
    }
    //문제4. 배열에 저장된 계좌정보 중 계좌번호가 "2222"인 계좌를 찾고
    //해당 계좌의 계좌주를 출력
//    for (int i =0; i<arr.length; i++){
//      if (arr[i].getAccNumber().equals("2211")){
//        System.out.println(arr[i].getOwner());
//      }
//    }
    for (Acc a : arr){
      if (a.getAccNumber().equals("2211"))
      {
        System.out.println(a.getOwner());
      }
    }
  }
}




