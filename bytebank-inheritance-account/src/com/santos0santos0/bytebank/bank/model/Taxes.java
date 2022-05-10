package com.santos0santos0.bytebank.bank.model;

public class Taxes {

    private double totalTaxes;

    public void register(Taxable taxable) {
        double value = taxable.getValueTaxes();
        this.totalTaxes += value;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }
}
