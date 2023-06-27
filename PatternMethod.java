import java.util.Scanner;

public class PatternMethod {
    static void pattern(int number, int k) {
        if (number > 0) {
            System.out.print(number + " ");
            number -= 5;
            pattern(number, k);
        } else {
            pattern2(number, k);
        }
    }

    static void pattern2(int number, int k) {
        if (number <= k) {
            System.out.print(number + " ");
            number += 5;
            pattern2(number,k);
        }
    }
    public static void main(String[] args) {
        int number, k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inp.nextInt();
        k=number;
        pattern(number, k);

    }
}