import java.util.ArrayList;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    public double total;
    public String name;
    public boolean ready;
    public ArrayList<Item> items;

    // CONSTRUCTOR
    public Order(String name, double total, boolean ready) {
        this.name = name;
        this.total = total;
        this.ready = ready;
        items = new ArrayList<>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
//    public Order(String name) {
//        this.name = name;
//    }
    // ORDER METHODS
    public void addItem(Item item){
        items.add(item);
        this.total += item.getPrice();
    }

    public double getTotal(){
        return total;
    }

    public String getName(){
        return name;
    }

    public boolean getStatus(){
        return ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setStatus(boolean status){
        ready = status;
    }


//
//    public getStatusMessage(String isReady){
//
//    }
//    public
//    // Most of your code will go here,
//    // so implement the getters and setters first!
//
//    // GETTERS & SETTERS
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isReady() {
//        return ready;
//    }
//
//    public void setReady(boolean ready) {
//        this.ready = ready;
//    }
}

