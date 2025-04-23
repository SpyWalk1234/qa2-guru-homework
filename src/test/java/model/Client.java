package model;

import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private AddressClient addressClient;
    private Order order;
    private AddressOrder addressOrder;

    public Client(String firstName, String lastName, int age, String email, int phoneNumber, AddressClient addressClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressClient = addressClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressClient getAddressClient() {
        return addressClient;
    }

    public void setAddressClient(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public AddressOrder getAddressOrder() {
        return addressOrder;
    }

    public void setAddressOrder(AddressOrder addressOrder) {
        this.addressOrder = addressOrder;
    }

    public String printClientDetails() {
        return "First name: " + firstName + " " + "Last name: " + lastName + " " + "Age: " + age + " " + "Email: " + email + " " + "Phone number: " + phoneNumber;
    }

    public void printOrderDetailsForClient(List<Order> orders) {
        System.out.println(order);
    }

    public String printClientOrder() {
        return firstName + " " + lastName + " " + age + " " + email + " " + phoneNumber + " " + order + " " + addressOrder;
    }

    public AddressOrder getAddress() {
        return addressOrder;
    }

}
