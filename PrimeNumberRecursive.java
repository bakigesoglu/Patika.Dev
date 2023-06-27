import java.util.Scanner;
public class PrimeNumberRecursive {
    static boolean isPrime(int number,int n) {
        if (n ==  1) {   // 1 e kadar n 1 er azalacak ve hala kalan sıfır olan yoksa n=1 durumunda sayı asal olur.
            return true;
        } else {
            if (number % n == 0) { // eğer n den 1 er geriye giderken n değeri ile bölümden kalan 0 ise asal degildir.
                return false;
            } else {
                return isPrime(number,n-1);
            }
        }
    }


    public static void main (String [] Args)
    {

        Scanner inp = new Scanner(System.in); 
        System.out.print("Enter a number: ");  // Kullanıcıdan sayı girişi alıyoruz.
        int number = inp.nextInt();
        boolean result = isPrime(number,number/2); //girilen sayı ve girilen sayının yarısı ile sorgulama yapmamız asal sayıyı aramaya yeterli.

        if (result) {
            System.out.print(number + " is a prime number.");
        } else {
            System.out.print(number + " is not a prime number.");
        }
    }
}

