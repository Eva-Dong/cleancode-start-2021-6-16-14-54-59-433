package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order o;

    public OrderReceipt(Order o) {
        this.o = o;
    }

    //Deprecated
    public String printCustomerName() {
        return o.getCustomerName();
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        printHeaders(output);
        printCustomerNameAndAddress(output);
        // prints lineItems
        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : o.getLineItems()) {
            printItems(output, lineItem);

            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * .10;
            totSalesTx += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
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
        // print total amount
        output.append("Total Amount").append('\t').append(tot);
    }

    private void printSaleTax(StringBuilder output, double totSalesTx) {
        // prints the state tax
        output.append("Sales Tax").append('\t').append(totSalesTx);
    }

    private void printCustomerNameAndAddress(StringBuilder output) {
        // print date, bill no, customer name
//        output.append("Date - " + order.getDate();
        output.append(o.getCustomerName());
        output.append(o.getCustomerAddress());
//        output.append(order.getCustomerLoyaltyNumber());
    }

    private void printHeaders(StringBuilder output) {
        // print headers
        output.append("======Printing Orders======\n");
    }
}