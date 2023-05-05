import java.util.Scanner;
/*
@author alfonso
 */
public class UserLogin {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();


        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("Hoşgeldiniz...");
        } else {
            System.out.println("Hatalı şifre");
            System.out.print("Şifrenizi sıfırlamak istermisiniz ? ");
            String response = input.nextLine();
            if (response.equals("Evet")) {
                System.out.println("Yeni şifrenizi belirleyiniz: ");
                password = input.nextLine();
                while (password.equals("java123")) {
                    System.out.println("Şifreniz önceki şifreyle aynı olamaz.");
                    System.out.println("Yeni şifrenizi belirleyiniz: ");
                    password = input.nextLine();
                }
                System.out.print("Şifreniz oluşturuldu ve giriş yapıldı.");

            }
            else {
                System.out.print("Sistemden çıkışınız gerçekleşti.");

            }
        }
    }
}


