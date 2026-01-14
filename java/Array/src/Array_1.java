public class Array_1 {
  public static void main(String[] args) {

    //배열의 선언 및 생성

    //정수를 여려개 저장할 수 있는 배열을 선언
    //자료형 변수명;
    int[] arr1;

    //배열의 생성(초기화)  -> 5개의 정수를 저장할 수 있는 배열 aar1 생성
    //정수형 배열을 생성 시 0으로 초기화
    arr1 = new int[5];

    //실수를 여러개 저장할 수 있는 배열 arr2 선언
    //실수형 배열은 생성 시 0.0으로 초기화
    double[] aar2;

    //실수를 3개 저장할 수 있는 arr2 배열 생성
    aar2 = new double[3];

    //문자열 5개를 저장할 수 있는 배열 arr3를 선언 및 생성
    //기본자료형을 제외한 모든 배열은 생성 시 'null'로 초기화
    //문자열 배열은 생성 시 'null'로 초기화
    //null -> 비어있다, 정해진 데이터가 없다
    String[] arr3 = new String[5];
  }
}
