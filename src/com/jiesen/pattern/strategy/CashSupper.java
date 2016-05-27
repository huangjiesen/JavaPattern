package com.jiesen.pattern.strategy;

/**
 * 现金收费抽象类
 * Created by sen on 16-5-24.
 */
abstract class CashSupper {
    /**
     * 收费计算方法
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
