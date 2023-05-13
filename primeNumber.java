public class primeNumber {
    public static void main(String[] Args) {

        for (int i = 2; i <= 100; i++) //sayı
        {
            int n = 0;
            for (int j = 1; j <= i; j++) {  //bölüm olusturduk. burada i yi tam bölen sayıları adedi 2 yi geçmezse yazdıracagız
                if (i % j == 0) {
                    n++;
                }
            }
            if (n <= 2) {
                System.out.println(i);
            }
        }
    }
}
