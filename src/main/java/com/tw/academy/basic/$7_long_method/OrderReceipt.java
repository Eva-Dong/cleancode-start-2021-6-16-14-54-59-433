package com.tw.academy.basic.$7_long_method;

public class OrderReceipt {
    public static final double ONE_PERCENT = .10;
    public static final String HEADER = "======Printing Orders======\n";
    public static final String SALES_TAX = "Sales Tax";
    public static final String TOTAL_AMOUNT = "Total Amount";
    public static final char TAB = '\t';
    public static final char LINE_BREAK = '\n';
    public static final double INITIAL_AMOUNT = 0d;
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptInfo = new StringBuilder();
        printHeaders(receiptInfo);
        printCustomerNameAndAddress(receiptInfo);

        double totalSalesTax = INITIAL_AMOUNT;
        double total = INITIAL_AMOUNT;
        for (LineItem lineItem : order.getLineItems()) {
            printItems(receiptInfo, lineItem);
            double salesTax = lineItem.totalAmount() * ONE_PERCENT;
            totalSalesTax += salesTax;
            total += lineItem.totalAmount() + salesTax;
        }

        printSaleTax(receiptInfo, totalSalesTax);
        printTotalAmount(receiptInfo, total);
        return receiptInfo.toString();
    }

    private void printItems(StringBuilder receiptInfo, LineItem lineItem) {
        receiptInfo.append(lineItem.getDescription());
        receiptInfo.append(TAB);
        receiptInfo.append(lineItem.getPrice());
        receiptInfo.append(TAB);
        receiptInfo.append(lineItem.getQuantity());
        receiptInfo.append(TAB);
        receiptInfo.append(lineItem.totalAmount());
        receiptInfo.append(LINE_BREAK);
    }

    private void printTotalAmount(StringBuilder receiptInfo, double total) {
        receiptInfo.append(TOTAL_AMOUNT).append(TAB).append(total);
    }

    private void printSaleTax(StringBuilder receiptInfo, double totalSalesTax) {
        receiptInfo.append(SALES_TAX).append(TAB).append(totalSalesTax);
    }

    private void printCustomerNameAndAddress(StringBuilder receiptInfo) {
        receiptInfo.append(order.getCustomerName());
        receiptInfo.append(order.getCustomerAddress());
    }

    private void printHeaders(StringBuilder receiptInfo) {
        receiptInfo.append(HEADER);
    }
}