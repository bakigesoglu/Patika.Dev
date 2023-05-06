import java.util.Scanner;
/*
@author alfonso
 */
public class FlightTicket {
    public static void main(String[] Args) {
        int age, distance;             //Değişkenlerimizi tanımladık.
        float priceKm = 0.10f, price, type;
        Scanner inp = new Scanner(System.in);

        System.out.print("your age: ");
        age = inp.nextInt();
        System.out.print("Please enter that will you go distance: ");
        distance = inp.nextInt();
        System.out.print("Only departure => 1 or Round trip => 2\n");
        type = inp.nextInt();

        while (age < 0 || distance < 0 || type < 0 || type > 2) { // negatif değer girince tekrarlayacak döngü
            System.out.print("your age: ");
            age = inp.nextInt();
            System.out.print("Please enter that will you go distance: ");
            distance = inp.nextInt();
            System.out.print("Only departure => 1 or Round trip => 2\n");
            type = inp.nextInt();
        }

        price = (priceKm * distance);  // indirimsiz bilet fiyatı

        if (type == 2) {
            price = (price * 0.8f) * 2;
        }
        if (age <= 12) {
            price = price * 0.5f;
        } else if (age <= 25) {
            price = price * 0.9f;
        } else if (age >= 65) {
            price = price * 0.7f;
        }
        System.out.print("Total ticket price: " + price);
    }}


