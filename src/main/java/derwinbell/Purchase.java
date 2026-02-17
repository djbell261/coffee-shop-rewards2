package derwinbell;

public class Purchase {
    private String itemName;

    private double price;

    private boolean isDrink;

    public Purchase(String itemName, double price, boolean isDrink){
            this.itemName = itemName;
            this.price = price;
            this.isDrink = isDrink;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getDrink() {
        return isDrink;
    }

    public void setDrink(boolean drink) {
        isDrink = drink;
    }
}
