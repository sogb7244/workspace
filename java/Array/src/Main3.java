import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;


        while (true){
            int count = 0;
            System.out.println("1부터 999까지 숫자 입력하세요");
            a = sc.nextInt();
            if (a < 1 || a > 999){
                System.out.println("다시 입력하세요");
                continue;
            }
                int h = a / 100;
                int t = (a % 100 )/ 10;
                int o = a % 10;

                if (h != 0 && h % 3 == 0){ count++;}
                if (t != 0 && t % 3 == 0){ count++;}
                if (o != 0 && o % 3 == 0){ count++;}


        switch (count){
            case 1:
                System.out.println("박수짝");
                break;
            case 2:
                System.out.println("박수짝짝");
                break;
            case 3:
                System.out.println("박수짝짝짝");
                break;
            default:
                System.out.println("박수 0번");
                break;

        }



        }
    }
}
