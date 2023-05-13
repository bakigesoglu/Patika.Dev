import java.util.Scanner;
public class invertedTriangle {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the how many steps will the inverted triangle have  : ");
        int n = inp.nextInt();

        for (int i = 0; i<n; i++) {

            for (int k = n; k>=n-i; k--) {
                System.out.print(" ");
            }
            for (int j=2*n-3; j >=2*i-1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
