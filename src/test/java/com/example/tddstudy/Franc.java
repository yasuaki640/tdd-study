package com.example.tddstudy;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc Franc = (Franc) object;
        return amount == Franc.amount;
    }
}
