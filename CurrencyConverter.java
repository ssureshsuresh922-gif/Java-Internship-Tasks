
import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.print("Choose: ");
        int ch = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (ch == 1)
            System.out.println("USD: " + amount / 88);
        else if (ch == 2)
            System.out.println("INR: " + amount * 88);
        else
            System.out.println("Invalid Choice");
    }
}
