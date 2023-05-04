import java.util.Scanner;
/*
@author alfonso
 */
class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product's price: ");
        Double price= input.nextDouble();

        boolean case1= price<=1000.0;
        Double kdv = case1 ? (price*0.18) : (price*0.08);
        System.out.print("Entered product's price"+ price);
        System.out.print("This Product's Kdv: "+ kdv);

    }
}