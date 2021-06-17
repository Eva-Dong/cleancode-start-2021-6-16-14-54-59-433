package com.tw.academy.basic.$5_data_clumps;

public class User {
    private String name;
    private String phoneNumber;
    private String address;

    public User(String buyerName) {
        this.name = buyerName;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String buyerPhoneNumber) {
        this.phoneNumber = buyerPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
