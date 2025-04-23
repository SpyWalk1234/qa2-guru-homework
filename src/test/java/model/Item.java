package model;

public class Item {
    private String itemName;
    private Integer itemQuantity;
    private double price;

    public Item(String itemName, Integer itemQuantity, double price) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String printItemDetails() {
        return itemName + " " + itemQuantity + " " + price;
    }

}
