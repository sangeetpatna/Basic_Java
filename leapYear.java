import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year you want to check for leap year : ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Entered year is a leap year.");
        }else{
            System.out.println("Entered year is not a leap year.");
        }
    }
}
