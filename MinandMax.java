import java.util.Scanner;
import java.util.Arrays;
public class MinandMax {
    public static void main (String [] Args) {
        Scanner input = new Scanner(System.in); // Kullanıcı girişi alabilmek için scanner nesne oluşturduk.

        System.out.print("How many numbers will you enter ");
        int n= input.nextInt();
        int [] numbers = new int[n]; // kullanıcının girdiği sayıları tutmak için n index e sahip dizi oluşturduk.

        for (int i=1; i<=n ; i++) // Kullanıcının gireceği sayı kadar sayı girişi için döngü oluşturduk.
        {
            System.out.println("Enter "+ i + ". number: ");
            numbers [i-1] = input.nextInt(); // girilen değeri dizinin (i-1). indeksine atadık. i-1 -> çünkü index 0 dan başlar.
        }
        Arrays.sort(numbers); // dizi içerisine aldığımız sayıları sıraladık. Böylece min değer 0. indeksde max değer son indexte olacak.

        System.out.println("Entered minimum number is: "+ numbers[0]);
        System.out.println("Entered maximum number is: "+ numbers[n-1]);
    }
}
