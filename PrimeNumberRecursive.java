import java.util.Scanner;
public class PrimeNumberRecursive {
    static boolean isPrime(int number,int n) {
        if (n ==  1) {
            return true;
        } else {
            if (number % n == 0) {
                return false;
            } else {
                return isPrime(number,n-1);
            }
        }
    }


    public static void main (String [] Args)
    {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inp.nextInt();
        boolean result = isPrime(number,number/2);

        if (result) {
            System.out.print(number + " is a prime number.");
        } else {
            System.out.print(number + " is not a prime number.");
        }
    }
}

