package com.example.tddstudy;

public interface Expression {
    Expression times(int multiplier);

    Expression plus(Expression addend);

    public Money reduce(Bank bank, String to);
}
