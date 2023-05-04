import java.util.Locale;
import java.util.Scanner;
/*
@author alfonso
 */

public class BodyMass {
    public static void main(String[] args) {
        double height, weight, bodyMassIndex ;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Please write your height in m : ");
        height = input.nextDouble();

        System.out.print("Please write your weight in kg : ");
        weight = input.nextDouble();
        bodyMassIndex = weight/(height * height);
        System.out.println("Your body mass index is : "+ bodyMassIndex);
        if(bodyMassIndex < 18.4){
            System.out.println("Skinny. It is recommended to gain weight with the help of a dietitian. ");
        }
        else if (18.4 < bodyMassIndex && bodyMassIndex < 24.9 ){
            System.out.println("Normal weight. It is recommended that continue to eat a balanced and healthy diet. ");
        }
        else if (24.9 < bodyMassIndex && bodyMassIndex < 29.9){
            System.out.println("Overweight. It is recommended to get rid of excess weight with proper diet. ");
        }
        else if (29.9 < bodyMassIndex && bodyMassIndex < 34.9){
            System.out.println("Flab and first degree obese. It is recommended that to lose weight with the help of a dietitian.");
        }
        else if (34.9 < bodyMassIndex && bodyMassIndex < 44.9 ){
            System.out.println("Flab and second degree obese. It is recommended that to lose weight with the help of a dietitian.");
        }
        else if (44.9 < bodyMassIndex ){
            System.out.println("Flab and third degree obese. It is recommended that to lose weight with the help of a dietitian and doctor.");
        }

    }
}