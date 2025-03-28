import java.util.Scanner;
public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = input.nextInt();

        if(a<0){
            System.out.println("Number entered is negative.");
        }else if(a>0){
            System.out.println("Number entered is positive.");
        }
        else{
            System.out.println("Number entered is Zero.");
        }
        }
    }

