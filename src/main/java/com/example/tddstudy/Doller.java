package com.example.tddstudy;

class Doller extends Money {

    public Doller(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier) {
        return new Doller(amount * multiplier);
    }
}
