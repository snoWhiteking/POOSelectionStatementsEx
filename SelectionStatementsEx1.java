import java.util.Scanner;

public class SelectionStatementsEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, select the code you want: ");
        int code = scanner.nextInt();

        System.out.print("Now please, select the quantity: ");
        int quantity = scanner.nextInt();

        String product;
        float price;

        switch (code) {

            case 1: 
                product = "Hot-Dog";
                price = 4.00f * quantity;
                break;
            case 2:
                product = "X-Salad";
                price = 4.50f * quantity;
                break;
            case 3:
                product = "X-Bacon";
                price = 5.00f * quantity;
                break;
            case 4:
                product = "Simple Toast";
                price = 2.00f * quantity;
                break;
            case 5:
                product = "Soda";
                price = 1.50f * quantity;
                break;
            default:
                product = "none";
                price = 0;
        }

        System.out.print("You asked for " + quantity + " of " + product + String.format("\nTotal: R$%.2f", price));
        scanner.close();

    }
}
