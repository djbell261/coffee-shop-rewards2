package derwinbell;

public class Customer {

    private String name;

    private String phoneNumber;



    private int drinksPurchase;

    public Customer(){
        this("Guest", "000-000-0000", 0);
    }

    public Customer(String name, String phoneNumber, int drinksPurchase){
        this.name = name;
        this.phoneNumber = phoneNumber;

        this.drinksPurchase = drinksPurchase;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public int getDrinksPurchase() {
        return drinksPurchase;
    }

    public void setDrinksPurchase(int drinksPurchase) {
        this.drinksPurchase = drinksPurchase;
    }

    public int count(int drinks){
        setDrinksPurchase(drinks);

        return drinks;
    }

    public boolean hasReward() {
        return this.drinksPurchase >= 5;
    }
}
