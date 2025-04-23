package tests.api;

import model.*;
import org.junit.jupiter.api.Test;

public class OnlineShop {

    @Test
    public void createClientsTest() {
        Client slevin = new Client("Slevin", "Kelevra", 28, "kelevra28@gmail.com", 223322223, new AddressClient("London", "Covent garden", 121));
        Client margaret = new Client("Margaret", "Taight", 32, "margo-t@gmail.com", 789123456, new AddressClient("New York", "5th avenue", 27));
        Client gary = new Client("Gary", "Goodsprings", 36, "gg_garry@gmail.com", 777888999,new AddressClient("Boston", "Bond street", 917));

        AddressOrder addressOrderSlevin = new AddressOrder("London", "Covent garden", 121);
        AddressOrder addressOrderMargaret = new AddressOrder("New York", "4th avenue", 25);
        AddressOrder addressOrderGary = new AddressOrder("Boston", "Bond street", 917);

        System.out.println(slevin.printClientDetails() + " " + addressOrderSlevin.printAddressOrder());
        System.out.println(margaret.printClientDetails() + " " + addressOrderMargaret.printAddressOrder());
        System.out.println(gary.printClientDetails() + " " + addressOrderGary.printAddressOrder());
    }

    @Test
    public void createItemsTest() {
        Item pillow = new Item("pillow", 2, 9.99);
        Item bookShelf = new Item("book shelf", 1, 39.99);
        Item rubberPool = new Item("rubber pool", 1, 99.95);
        Item carpet = new Item("carpet", 1, 58.00);
        Item mug = new Item("mug", 10, 5.50);
        Item shovel = new Item("shovel", 3, 15.99);
        Item iron = new Item("iron", 1, 29.95);
        Item tv = new Item("tv", 1, 350);
        Item pen = new Item("pen", 20, 1.99);
        Item flowerPot = new Item("flower pot", 5, 10.02);

        System.out.println(pillow.printItemDetails() + bookShelf.printItemDetails() + rubberPool.printItemDetails() + carpet.printItemDetails() + mug.printItemDetails() +
                shovel.printItemDetails() + iron.printItemDetails() + tv.printItemDetails() + pen.printItemDetails() + flowerPot.printItemDetails());
    }

    @Test
    public void basketTest() {
        Client james = new Client("James", "Barr", 45, "barr123@gmail.com", 546768978, new AddressClient("Los Angeles", "Liberty street", 38));
        Client sarah = new Client("Sarah", "Rafferty", 38, "sararaf@gmail.com", 444444444, new AddressClient("Columbus", "High street", 100));

        Order orderJames = new Order(new AddressOrder("Riga", "Brivibas", 121));
        orderJames.addItem(new Item("milk" , 10, 20));
        orderJames.addItem(new Item("spoon", 15, 45));

        Order orderSarah = new Order(new AddressOrder("Columbus", "High street", 100));
        orderSarah.addItem(new Item("towel", 1, 15.50));
        orderSarah.addItem(new Item("shampoo", 2, 5.70));

        System.out.println(james.printClientDetails());
        System.out.println(sarah.printClientDetails());

        orderJames.printBasketForClient(james);
        orderSarah.printBasketForClient(sarah);
    }

    @Test
    public void deliveryTest() {
        Client peter = new Client("Peter", "Moulenie", 50, "peter75@gmail.com", 630946378, new AddressClient("Paris", "Baguette street", 11));
        Client helen = new Client("Helen", "Reives", 33, "h-reives@gmail.com", 234222999, new AddressClient("Birmingham", "Godiva street", 203));

        Order orderPeter = new Order(new AddressOrder("Riga", "Skanstes street", 22));
        Order orderHelen = new Order(new AddressOrder("Paris", "Baguette street", 11));
        orderPeter.addItem(new Item("milk", 1, 1.70));
        orderPeter.addItem(new Item("eggs", 10, 3.00));
        orderPeter.addItem(new Item("chicken", 1, 5.50));
        orderHelen.addItem(new Item("flower pot", 1, 5));
        orderHelen.addItem(new Item("towel", 2, 20));

        System.out.println(peter.printClientDetails());
        orderPeter.printOrderDetails(peter);

        System.out.println(helen.printClientDetails());
        orderHelen.printOrderDetails(helen);
    }
}
