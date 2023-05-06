import java.util.Scanner;
/*
@author alfonso
 */
public class FlightTicket {
    public static void main(String[] Args) {
        int age, distance, k;             //Değişkenlerimizi tanımladık.
        float priceKm = 0.10f, price, roundDiscount, type;
        Scanner inp = new Scanner(System.in);
        System.out.print("your age: ");
        age = inp.nextInt();

        while (age < 0) {     // yaş 0 ın altında girildiğinde sürekli yaşı soracak döngüyü oluşturduk.
            System.out.print("your age: ");
            age = inp.nextInt();
        }

        System.out.print("Please enter that will you go distance: ");
        distance = inp.nextInt();

        price = (priceKm * distance);  // indirimsiz bilet fiyatı

        System.out.print("Only departure => 1 or Round trip => 2\n");
        type = inp.nextInt();
        switch ((int) type) {  // yolculuk tipine göre ücretlendirme yapmak için şart koşulu oluşturduk.
            case 1 -> {
                type = 0.0f;
                k = 1;
                if (age <= 12) {
                    roundDiscount = price * 0.5f + price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                } else if (age < 24) {
                    roundDiscount = price * 0.1f + price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                } else if (age >= 65) {
                    roundDiscount = price * 0.3f + price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                } else {
                    roundDiscount = price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                }
            }
            case 2 -> {
                type = 0.2f;
                k = 2;
                if (age <= 12) {
                    roundDiscount = price * 0.5f + price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                } else if (age < 24) {
                    roundDiscount = price * 0.1f + price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                } else if (age >= 65) {
                    roundDiscount = price * 0.3f + price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                } else {
                    roundDiscount = price * type;
                    price -= roundDiscount;
                    System.out.print("Price: " + price * k);
                }
            }
        }

        }
    }
