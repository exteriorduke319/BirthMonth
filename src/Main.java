import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("Enter the number of your birth month: ");

        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an invalid value for birth month: " + birthMonth);
                System.exit(0);
            }
        } else {
            System.out.println("You entered an invalid value for birth month: " + birthMonth);
            System.exit(0);
        }
    }
}