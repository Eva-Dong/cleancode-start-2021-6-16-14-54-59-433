package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private User user;
    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public String getBuyerName() {
        return user.getName();
    }

    public void setBuyerName(String buyerName) {
        user = new User(buyerName);
    }

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.setBuyerName(buyerName);
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", getBuyerName(), buyerPhoneNumber, buyerAddress);
    }
}

