import java.util.Scanner;
public class fibonacci {
    public static void main (String []Args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= inp.nextInt();
        int total,n1=0,n2=1;
        System.out.print(n1+" "+n2);//0 ve 1 yazdırdık.

        for (int i = 2; i<n ;i++) // döngü 2 den baslıyor çünkü ilk iki terimi yazdırdık.
    {
        total=n1+n2;
        System.out.print(" "+total);
        n1=n2;
        n2=total;
    }
    }
}
