package com.tw.academy.basic.$7_long_method;

public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptInfo = new StringBuilder();
        printHeaders(receiptInfo);
        printCustomerNameAndAddress(receiptInfo);

        double totalSalesTax = 0d;
        double total = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            printItems(receiptInfo, lineItem);
            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;
            total += lineItem.totalAmount() + salesTax;
        }

        printSaleTax(receiptInfo, totalSalesTax);
        printTotalAmount(receiptInfo, total);
        return receiptInfo.toString();
    }

    private void printItems(StringBuilder receiptInfo, LineItem lineItem) {
        receiptInfo.append(lineItem.getDescription());
        receiptInfo.append('\t');
        receiptInfo.append(lineItem.getPrice());
        receiptInfo.append('\t');
        receiptInfo.append(lineItem.getQuantity());
        receiptInfo.append('\t');
        receiptInfo.append(lineItem.totalAmount());
        receiptInfo.append('\n');
    }

    private void printTotalAmount(StringBuilder receiptInfo, double tot) {
        receiptInfo.append("Total Amount").append('\t').append(tot);
    }

    private void printSaleTax(StringBuilder receiptInfo, double totSalesTx) {
        receiptInfo.append("Sales Tax").append('\t').append(totSalesTx);
    }

    private void printCustomerNameAndAddress(StringBuilder receiptInfo) {
        receiptInfo.append(order.getCustomerName());
        receiptInfo.append(order.getCustomerAddress());
    }

    private void printHeaders(StringBuilder receiptInfo) {
        receiptInfo.append("======Printing Orders======\n");
    }
}