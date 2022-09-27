public class Item {

    // MEMBER VARIABLES
    private String name;
    private double price;

    // CONSTRUCTOR
    //   Takes a name and price as arguments
    //   and sets them accordingly
    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    // GETTERS & SETTERS  - for name and price
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
