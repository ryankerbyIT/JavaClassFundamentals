public class RetailItemTest {
    public static void main(String[] args) {
        // Creating three RetailItem objects with provided data
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        // Displaying information about the items
        System.out.println("Item #1:");
        System.out.println("Description: " + item1.getDescription());
        System.out.println("Units on Hand: " + item1.getUnitsOnHand());
        System.out.println("Price: $" + item1.getPrice());

        System.out.println("\nItem #2:");
        System.out.println("Description: " + item2.getDescription());
        System.out.println("Units on Hand: " + item2.getUnitsOnHand());
        System.out.println("Price: $" + item2.getPrice());

        System.out.println("\nItem #3:");
        System.out.println("Description: " + item3.getDescription());
        System.out.println("Units on Hand: " + item3.getUnitsOnHand());
        System.out.println("Price: $" + item3.getPrice());
    }
}
/*
 * RetailItemTest Class:

Creates three instances of the RetailItem 
class using the provided data: a jacket, 
designer jeans, and a shirt.
Displays the description, units on hand, 
and price for each item.

*/
