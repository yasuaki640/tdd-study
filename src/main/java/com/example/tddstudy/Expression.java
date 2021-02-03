package com.example.tddstudy;

public interface Expression {
    Expression plus(Expression addend);

    public Money reduce(Bank bank, String to);
}
