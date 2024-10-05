public class RetailItem {
    // Fields
    private String description;
    private int unitsOnHand;
    private double price;

    // Constructor
    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    // Setters (Mutators)
    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters (Accessors)
    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }
}
/* 
RetailItem Class:

Contains fields for description (String), 
unitsOnHand (int), and price (double).
The constructor initializes these fields 
based on the parameters passed to it.
Setters (mutators) are used to modify 
field values, while getters (accessors) 
are used to retrieve field values.

*/