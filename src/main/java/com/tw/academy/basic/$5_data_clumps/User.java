package com.tw.academy.basic.$5_data_clumps;

public class User {
    private String name;
    private String phoneNumber;

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

}
