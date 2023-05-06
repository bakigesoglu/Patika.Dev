import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] Args) {
        int birthYear, remain;
        Scanner inp = new Scanner(System.in); // Kullanıcı girişi için scanner nesne oluşturduk

        System.out.print("Enter year of birth: "); // Kullanıcıdan doğum yılı girişi istedik
        birthYear = inp.nextInt();
        remain = birthYear % 12;
        switch (remain) {  // 12 ile bölümünden kalana göre zodiac bulacak şartı oluşturduk.
            case 0 -> System.out.print("Your Chinese Zodiac is Monkey");
            case 1 -> System.out.print("Your Chinese Zodiac is Cock");
            case 2 -> System.out.print("Your Chinese Zodiac is Dog");
            case 3 -> System.out.print("Your Chinese Zodiac is Pig");
            case 4 -> System.out.print("Your Chinese Zodiac is Mouse");
            case 5 -> System.out.print("Your Chinese Zodiac is Ox");
            case 6 -> System.out.print("Your Chinese Zodiac is Tiger");
            case 7 -> System.out.print("Your Chinese Zodiac is Rabbit");
            case 8 -> System.out.print("Your Chinese Zodiac is Dragon");
            case 9 -> System.out.print("Your Chinese Zodiac is Snake");
            case 10 -> System.out.print("Your Chinese Zodiac is Horse");
            case 11 -> System.out.print("Your Chinese Zodiac is Sheep");
        }

        }
    }
