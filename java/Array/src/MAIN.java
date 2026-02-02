import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int [] a= new int[3];
        int b= 0;
       for (int i = 0; i<a.length; i++) {
           a[i] = sc.nextInt();
       }
       for (int i = 0; i<a.length-1; i++)
           for (int j = i+1; j<a.length ;j++){

               if (a[i] < a[j]){
                   b = a[i];
                   a[i] = a[j];
                   a[j] = b;
               }
           }


       for (int i = 0; i<a.length;i++){
           System.out.println(a[i]);

       }
   }
}
