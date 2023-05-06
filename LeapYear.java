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

        if (year % 100 != 0 &&  year % 4==0 || year%400==0) { //Artık yılı bulmak için koşullarımızı olusturduk.
                System.out.print(year + " is leap year");
            }
            else {
                System.out.print(year + " is not leap year.");
            }
        }

    }