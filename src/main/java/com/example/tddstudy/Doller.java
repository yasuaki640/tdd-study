package com.example.tddstudy;

class Doller extends Money {

    public Doller(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return Money.doller(amount * multiplier);
    }
}
