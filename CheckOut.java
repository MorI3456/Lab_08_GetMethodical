import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            // Prompt for the price of an item, ensuring it's within $0.50 to $10.00
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);

            // Add the item price to the total cost
            totalCost += itemPrice;

            // Ask if the user has more items
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");

        } while (moreItems); // Continue if user has more items

        // Display the total cost of the items
        System.out.printf("The total cost of your items is: $%.2f\n", totalCost);
    }
}
