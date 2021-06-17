package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address to;
    private final Address from;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate(){
        boolean isSameProvince = to.getProvince().equals(from.getProvince());
        boolean isSameCity = to.getCity().equals(from.getCity());
        if (isSameProvince && isSameCity){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

}
