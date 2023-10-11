package labAct1;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			shoppingList sl = new shoppingList();
			Scanner sc = new Scanner (System.in);
		
			sl.addItem("Milk", "Fresh milk", 85.50);
			sl.addItem("Bread", "Whole wheat bread", 65.25);
			sl.addItem("Eggs", "Large eggs (dozen)", 110.75);
			sl.addItem("Rice", "Jasmine (25 kg)", 1250.0);
			sl.addItem("Candy", "White Rabbit", 47.80);
			
			while (true) {
				try {
	            System.out.println("Online Shopping List");
	            System.out.println("1. Display List");
	            System.out.println("2. Add Item");
	            System.out.println("3. Remove Item");
	            System.out.println("4. Mark Item as Purchased");
	            System.out.println("5. Exit");
	            System.out.print("\nEnter your choice: ");

	            int pick = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            if (pick == 1) {
	                sl.displayItems();
	            } 
	            else if (pick == 2) {
	                System.out.print("\nEnter item name: ");
	                String itemName = sc.nextLine();
	                System.out.print("Enter item description: ");
	                String itemDescription = sc.nextLine();
	                System.out.print("Enter item price: ");
	                double itemPrice = sc.nextDouble();
	                sl.addItem(itemName, itemDescription, itemPrice);
	            } 
	            else if (pick == 3) {
	                System.out.print("\nEnter item name to remove: ");
	                String itemName = sc.nextLine();
	                sl.removeItem(itemName);
	            } 
	            else if (pick == 4) {
	                System.out.print("\nEnter item name to mark as purchased: ");
	                String itemName = sc.nextLine();
	                sl.markAsPurchased(itemName);
	            } 
	            else if (pick == 5) {
	                System.out.println("Thank you for using the program!");
	                System.exit(0);
	            } 
	            else {
	                System.out.println("Invalid input. Please enter a valid number.\n");
	            }
	        }
				catch(InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid number.\n");
					sc.nextLine(); // Clear the input buffer)
				}
			}
	  }
}