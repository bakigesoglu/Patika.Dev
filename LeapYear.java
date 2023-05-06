import java.util.Scanner;
/*
@author alfonso
 */
public class LeapYear {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.print("Enter the year to find the leap year: ");
        year = inp.nextInt();
        int a = year % 100;
        System.out.println(a);
        if (year % 100 == 0) {
            if (year % 16 == 0) { // 400 e bölünme şartı 16 ve 25 e bölünme olduğu için. 400= 2^4*5^2
                                  //100 e  bölünen sayı 25 e bölündüğü için 25 için şart oluşturmadık.
                System.out.print(year + " is leap year");
            }
            else {
                System.out.print(year + " is not leap year.");
            }
        }
        else {
            if (year%4==0)
            {
                System.out.print(year + " is leap year.");
            }
            else {
                System.out.print(year + " is not leap year.");
            }
        }

    }
}
