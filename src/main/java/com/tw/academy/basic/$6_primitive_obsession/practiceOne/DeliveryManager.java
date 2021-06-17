package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address to;
    private final Address from;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate(){
        boolean isSameProvince = getProvince(this.to.getAddress()).equals(getProvince(this.from.getAddress()));
        boolean isSameCity = getCity(this.to.getAddress()).equals(getCity(this.from.getAddress()));
        if (isSameProvince && isSameCity){
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
