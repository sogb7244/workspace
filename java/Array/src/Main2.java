public class Main2 {
    public static void main(String[] args) {
        int[] a = new int[6];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 46 + 1);
            for (int j= 0; j <i;j++){
                if (a[i] == a[j]){
                    i--;
                    break; //탈출
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
