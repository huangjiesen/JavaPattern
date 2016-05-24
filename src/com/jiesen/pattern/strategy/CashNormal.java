package com.jiesen.pattern.strategy;

/**
 * 正常收费子类
 * Created by sen on 16-5-24.
 */
public class CashNormal extends Cash {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
