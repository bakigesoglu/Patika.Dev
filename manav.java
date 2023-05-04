import java.util.Scanner;

/*
@author alfonso
 */
class Manav {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldınız: ");
        double kg1 = inp.nextDouble();
        System.out.print("Kaç kilogram elma aldınız: ");
        double kg2 = inp.nextDouble();
        System.out.print("Kaç kilogram domates aldınız: ");
        double kg3 = inp.nextDouble();
        System.out.print("Kaç kilogram muz aldınız: ");
        double kg4 = inp.nextDouble();
        System.out.print("Kaç kilogram patlıcan aldınız: ");
        double kg5 = inp.nextDouble();
        double pricekg1 = armut * kg1;
        double pricekg2 = elma * kg2;
        double pricekg3 = domates * kg3;
        double pricekg4 = muz * kg4;
        double pricekg5 = patlican * kg5;

        System.out.println("Armut " + kg1 + "kg : " + pricekg1 + " tl");
        System.out.println("Elma " + kg2 + "kg : " + pricekg2 + " tl");
        System.out.println("Domates " + kg3 + "kg : " + pricekg3 + " tl");
        System.out.println("Muz " + kg4 + "kg : " + pricekg4 + " tl");
        System.out.println("Patlıcan " + kg5 + "kg : " + pricekg5 + " tl");
        double toplam = pricekg1 + pricekg2 + pricekg3 + pricekg4 + pricekg5;
        System.out.println("Toplam tutar: " + toplam + " tl");
    }
}