import java.awt.*;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Divide");
        System.out.println("4.Multiply");

        System.out.println("Choose an operation:");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println(num1+num2);
        }
        else if (choice == 2){
            System.out.println(num1-num2);
        }
        else if (choice == 4){
            System.out.println(num1*num2);
        }
        else if (choice == 3){
            System.out.println((float) num1/num2);
        }

    }

}
