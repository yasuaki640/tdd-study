package com.example.tddstudy;

abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money doller(int amount) {
        return new Doller(amount,"USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

}
