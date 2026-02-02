import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random()*100+1);

        while(true){
            System.out.println("입력하세요");
            int b = sc.nextInt();
            if (b > a){
                System.out.println("숫자가큽니다");

            }
            else if (b < a){
                System.out.println("숫자가작습니다");

            }
            else if ( a == b){
                System.out.println("정답");
                break;
            }


        }
    }
}
