import java.util.ArrayList;

import java.text.NumberFormat;

public class TestOrders {
    public static void main(String[] args) {

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        Item item1 = new Item(3.5, "mocha");
        Item item2 = new Item(4.2, "drip coffee");
        Item item3 = new Item(3.7, "capuccino");
        Item item4 = new Item(4.5, "latte");

//        Order variable
        Order order1 = new Order("Martell", 12.5, false);
        Order order2 = new Order("Robert", 3.5, false);
        Order order3 = new Order("Michael", 7.8, false);
        Order order4 = new Order("Jarrod", 5.6, false);

        order2.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item4);
        order1.setStatus(true);
        order4.addItem(item4);
        order4.addItem(item4);
        order2.setStatus(true);


//        System.out.println(formatter.format(order2.getTotal()));
//        System.out.println((order2.getItems()));

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);


    }
}