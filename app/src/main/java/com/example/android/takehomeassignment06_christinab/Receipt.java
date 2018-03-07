package com.example.android.takehomeassignment06_christinab;

import java.io.Serializable;


public class Receipt implements Serializable {

    public double amount;
    public double tax;
    public double tip;
    public double total;

    public Receipt(double amount, double tax, double tip) {
        this.amount = amount;
        this.tax = tax;
        this.tip = tip;

    }

    public String toString() {
        total = amount + (amount * tax) + (amount * tip);
        return "Total: $" + amount + "\nSales Tax: " + (tax * 100) + "\nTip: " + (tip * 100) + "\nGrand Total: $" + total;

    }

}
