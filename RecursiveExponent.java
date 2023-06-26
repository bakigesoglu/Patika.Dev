import java.util.Scanner;
public class RecursiveExponent {
    static int exp(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        return base * exp(base, pow - 1);
    }

    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        int base, pow;
        System.out.print("Please enter base number: ");
        base = inp.nextInt();
        System.out.print("Please enter exponent number: ");
        pow = inp.nextInt();

        System.out.print(exp(base, pow));

    }
}

