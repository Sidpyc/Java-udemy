
import java.util.Scanner;

public class dowhilerunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a Number:");
            number = sc.nextInt();
            System.out.println("Cube is " + (number*number*number));
        }while (number>0);

    }
}
