import java.util.Scanner;

public class PurchaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Purchase[] purchases = new Purchase[5]; 

        for (int i = 0; i < purchases.length; i++) {
            int invNum;
            double saleValue;

            do {
                System.out.print("Enter invoice number (1000 - 8000) for purchase " + (i + 1) + ": ");
                invNum = scanner.nextInt();
                if (invNum < 1000 || invNum > 8000) {
                    System.out.println("Error: Invoice number must be between 1000 and 8000.");
                }
            } while (invNum < 1000 || invNum > 8000);

            do {
                System.out.print("Enter sale amount (non-negative) for purchase " + (i + 1) + ": ");
                saleValue = scanner.nextDouble();
                if (saleValue < 0) {
                    System.out.println("Error: Sale amount cannot be negative.");
                }
            } while (saleValue < 0);

            purchases[i] = new Purchase(invNum, saleValue);
        }

        System.out.println("\nAll Purchase Details:");
        System.out.println("==========================");
        for (Purchase p : purchases) {
            p.displayPurchase();
        }

        scanner.close();
    }
}