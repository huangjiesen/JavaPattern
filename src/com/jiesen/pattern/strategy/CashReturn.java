package com.jiesen.pattern.strategy;

/**
 * 反复收费子类
 * Created by sen on 16-5-24.
 */
public class CashReturn extends Cash {
    private double moneyCondition;
    private double moneyReturn;
    /**
     * 初始化时要求传入返利条件及返利值
     * @param moneyCondition 返利条件
     * @param moneyReturn 返利值
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition) {
            money = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
