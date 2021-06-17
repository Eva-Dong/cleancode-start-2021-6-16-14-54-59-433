package com.tw.academy.basic.$7_long_method;

public class OrderReceipt {
    private Order o;

    public OrderReceipt(Order o) {
        this.o = o;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        printHeaders(output);
        printCustomerNameAndAddress(output);

        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : o.getLineItems()) {
            printItems(output, lineItem);
            double salesTax = lineItem.totalAmount() * .10;
            totSalesTx += salesTax;
            tot += lineItem.totalAmount() + salesTax;
        }

        printSaleTax(output, totSalesTx);
        printTotalAmount(output, tot);
        return output.toString();
    }

    private void printItems(StringBuilder output, LineItem lineItem) {
        output.append(lineItem.getDescription());
        output.append('\t');
        output.append(lineItem.getPrice());
        output.append('\t');
        output.append(lineItem.getQuantity());
        output.append('\t');
        output.append(lineItem.totalAmount());
        output.append('\n');
    }

    private void printTotalAmount(StringBuilder output, double tot) {
        output.append("Total Amount").append('\t').append(tot);
    }

    private void printSaleTax(StringBuilder output, double totSalesTx) {
        output.append("Sales Tax").append('\t').append(totSalesTx);
    }

    private void printCustomerNameAndAddress(StringBuilder output) {
        output.append(o.getCustomerName());
        output.append(o.getCustomerAddress());
    }

    private void printHeaders(StringBuilder output) {
        output.append("======Printing Orders======\n");
    }
}