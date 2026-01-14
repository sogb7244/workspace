import java.util.Scanner;

public class While_실습7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

   int a = sc.nextInt();
   int sum= 0;

    for (int b = sc.nextInt(); a <= b; a++)
    {
      if (a <= b){
        sum = a+sum;
      }
      System.out.println("1부터 "+b+"까지의 합" +sum);
    }


    sc.close();
  }
}
