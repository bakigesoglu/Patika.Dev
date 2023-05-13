import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=inp.nextInt();
        int  total=0;
        for(int i=1;i<number;i++){  //ptbs toplamını bulmak için döngü olusturduk.
            if(number%i==0){
                total=total+i;
            }
        }if(total==number){
            System.out.println(number+" is a perfect number");
        }else {
            System.out.println(number+" is not a perfect number.");
        }
    }
}
