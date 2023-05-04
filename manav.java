import java.util.Scanner ;
import java.util.Locale;
class Manav {
    public static void main(String[] args) {

        double  pear = 2.14, pearKg, apple = 3.67, appleKg, tomato = 1.11, tomatoKg, banana = 0.95,
                bananaKg, eggplant = 5.0, eggplantKg ;
        double total1, total2, total3, total4, total5, totalFee ;
        Scanner input =  new Scanner(System.in).useLocale(Locale.US);


        System.out.print("How many kilos of pears would you like to buy : ");
        pearKg = input.nextDouble();
        total1 = pearKg * pear ;

        System.out.print("How many kilos of apples would you like to buy : ");
        appleKg = input.nextDouble();
        total2 = appleKg * apple ;

        System.out.print("How many kilos of tomatos would you like to buy : ");
        tomatoKg = input.nextDouble();
        total3 = tomatoKg * tomato ;

        System.out.print("How many kilos of bananas would you like to buy : ");
        bananaKg = input.nextDouble();
        total4 = bananaKg * banana ;

        System.out.print("How many kilos of eggplants would you like to buy : ");
        eggplantKg = input.nextDouble();
        total5 = eggplantKg * eggplant ;

        totalFee = total1 + total2 + total3 + total4 + total5 ;

        System.out.print("Your total fee is : " + totalFee);

    }
}