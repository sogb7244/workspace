package test;

//아래 인터페이스에서 제시한 메서드를 구현하는 클래스를
//만들고, 요구사항에 맞게 메서드를 구현!
public interface ArrayUtil {
  //매개변수로 전달된 두 정수형 배열의 모든 요소의 평균을 리턴
  int getArraySum(int[] arr1, int [] arr2);

  //매개변수로 전달된 배열의 모든 요소가 짝수 일때는 리턴 true, 아닐 때는 false 리턴
  boolean isEvenArray(int[] arr);

  //매개변수로 전달된 문자열 배열 각 요소의 글자수를 배열로 리턴
  //ex> 매개변수 ["aa", "aaa", "aaaa"] -> 결과 : [2,3,4]
  int[] getStrLengthArray(String[] arr);
}
