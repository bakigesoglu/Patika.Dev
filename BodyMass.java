import java.util.Scanner;
/*
@author alfonso
 */
public class BodyMass {

        public static void main (String[] args){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter your high: ");
            double high= input.nextDouble();
            System.out.print("Enter your weight: ");
            double weight= input.nextDouble();
            double vki= weight/(Math.pow(high,2));
            System.out.print("Your body mass index is : "+ vki);
        }
    }
