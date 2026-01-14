public class Array_2실습2 {
  public static void main(String[] args) {

    int[] arr1 = {5,4,3,2,1};
    int[] newarr = new int[5];
    for (int i =0; i < arr1.length;i++){
      newarr[i] = arr1[i];
    }
    for (int i =0; i <arr1.length; i++){
      System.out.println(newarr[i]);
    }

  }
}
