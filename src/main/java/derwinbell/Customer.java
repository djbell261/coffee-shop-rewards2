package derwinbell;

public class Customer {

    private String name;

    private String phoneNumber;

    private int points;

    public Customer(String name, String phoneNumber, int points){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.points = points;

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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
