
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Swapping Tool");
        System.out.println("Enter the value of A : ");
        int a = input.nextInt();
        System.out.println("Enter the value of B : ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Value of A is "+a);
        System.out.println("Value of B is "+b);
        System.out.println("Swapping done successfully!");
    }
}
