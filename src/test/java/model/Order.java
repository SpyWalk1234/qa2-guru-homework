package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Item> items;
    private boolean delivery;
    private Client client;
    private AddressClient addressClient;
    private Item item;
    private AddressOrder addressOrder;

    public Order(AddressOrder addressOrder) {
        this.addressOrder = addressOrder;
        this.items = new ArrayList<>();
        this.delivery = true;

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public double getTotalPrice(List<Item> items) {
        return items.size()*item.getPrice();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public AddressClient getAddressClient() {
        return addressClient;
    }

    public void setAddressClient(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public AddressOrder getAddressOrder() {
        return addressOrder;
    }

    public void setAddressOrder(AddressOrder addressOrder) {
        this.addressOrder = addressOrder;
    }

    public void addItem(Item item) {
        items.add(item);
        // В момент создания Purchase мы создаём пустой список продукции (выше в переменной) и кладём продукт в список покупок. Будет вызываться каждый раз, пока продукты добавляются.
    }

     public void printBasketForClient(Client client) {
         System.out.println("Basket: " + items);

         for (Item p: items) {
             System.out.println(p.getItemName() + ": " + p.getPrice()); //без порядкового номера, все продукты с ценой
         }
     }

    public void printOrderDetails() {
        System.out.println("-------Receipt Begin--------");
//        System.out.println("User: " + client.getFirstName());

        for (Item p: items) {
            System.out.println(p.getItemName() + ": " + p.getPrice());
        }
    }
}
