package org.example;

public abstract class Site {
    protected static double TAX_RATE=1;

    public double getBillableAmount(double units, double rate) {
        double base = getBase(units, rate);
        double tax = getTax(base);
        return base + tax;
    }

    protected abstract double getTax(double base);

    protected abstract double getBase(double units, double rate);
}
