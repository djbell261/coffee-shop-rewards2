package derwinbell;

public class CoffeeItem {
    private String itemName;

    private double price;



    public CoffeeItem(String itemName, double price ){
            this.itemName = itemName;
            this.price = price;


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


}
