package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private final Receiver receiver;
    private final Sender sender;
    private String size;
    private Double weight;

    private String receiverName;
    private String receiverPhoneNumber;
    private String receiverAddress;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;

    public Parcel(String size, Double weight,
                  Receiver receiver, Sender sender) {
        this.size = size;
        this.weight = weight;
        this.receiver = receiver;
        this.receiverName = this.receiver.getReceiverName();
        this.receiverPhoneNumber = this.receiver.getReceiverPhoneNumber();
        this.receiverAddress = this.receiver.getReceiverAddress();
        this.sender = sender;
        this.senderName = this.sender.getSenderName();
        this.senderPhoneNumber = this.sender.getSenderPhoneNumber();
        this.senderAddress = this.sender.getSenderAddress();
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                receiverName, receiverPhoneNumber, receiverAddress);
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
