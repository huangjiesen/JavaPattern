package com.jiesen.pattern.strategy;

/**
 * 打折收费子类
 * Created by sen on 16-5-24.
 */
public class CashRebate extends CashSupper {
    private double moneyRebate=1;

    /**
     * 初始化时要求传入折扣率
     * @param moneyRebate 折扣率
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
