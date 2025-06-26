import java.util.Scanner;

public class menu_runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        int choice = sc.nextInt();

        menuUsingSwitch(a, b, choice);

    }

    private static void menuUsingIf(int a, int b, int choice) {
        if (choice == 1) {
            System.out.println(a + b);
        } else if (choice == 2) {
            System.out.println(a - b);
        } else if (choice == 3) {
            System.out.println((float) a / b);
        } else if (choice == 4) {
            System.out.println(a * b);
        } else {
            System.out.println("Invalid Choice");
        }
    }

    private static void menuUsingSwitch(int a, int b, int choice) {
        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println((float) a / b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}