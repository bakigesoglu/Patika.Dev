import java.util.Scanner;
/*
@author alfonso
 */
public class SimpleCalculator {
    public static void main(String[] Args) {


        double n1, n2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        n1 = inp.nextDouble();
        System.out.print("Enter Second Number:");
        n2 = inp.nextDouble();

        System.out.println("1- +\n2. -\n3. /\n4. * ");
        System.out.print("Please choose the operator: ");
        int a = inp.nextInt();
        switch (a) {
            case 1:
                System.out.print("result : " + n1 + n2);
                break;
            case 2:
                System.out.print("result: " + (n1 - n2));
                break;
            case 3:
                if (n2==0) {
                    System.out.print("Incorrect operation: You can not divide to 0 ");
            }
                else {  System.out.print("result: " + (n1 / n2)); }
                break;
            case 4:
                System.out.print("result: " + (n1 * n2));
                break;
            default:
                System.out.print("Incorrect choosing the wrong operator...");


        }
    }
}