package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    private final double twentyPercentDiscount = 0.8;
    private final double fiftyPercentDiscount = 0.5;
    private final double firstPrice = 100;
    private final double secondPrice = 150;
    private final double thirdPrice = 400;


    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= firstPrice && cumulativeExpensesThisMonth < secondPrice) {
            return originalPrice * twentyPercentDiscount;
        }
        if (cumulativeExpensesThisMonth >= secondPrice && cumulativeExpensesThisMonth < thirdPrice) {
            return originalPrice * fiftyPercentDiscount;
        }
        return originalPrice;
    }
}
