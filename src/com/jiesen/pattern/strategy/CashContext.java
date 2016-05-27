package com.jiesen.pattern.strategy;

/**
 * 策略模式与工厂模式的结合
 * <p>扩展收费方式，只需要添加现金收费抽象类的子类然后在下面的构造方法中添加分支<p/>
 * Created by sen on 16-5-24.
 */
public class CashContext {
    private CashSupper cash;
    public CashContext(String cashType) {
        switch (cashType) {
            case "満300返100":
                cash = new CashReturn(300, 100);
            case "打8折":
                cash = new CashRebate(0.8);
            case "正常收费":
                cash = new CashNormal();
        }
    }

    public double getResult(double money) {
        return cash.acceptCash(money);
    }
}
