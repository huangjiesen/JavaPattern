package com.jiesen.pattern.strategy;

/**
 * 现金收费对象工厂类
 * Created by sen on 16-5-24.
 */
public class CashFactory {
    public static Cash getCash(String cashType) {
        switch (cashType) {
            case "正常收费":
                return new CashNormal();
            case "満300返100":
                return new CashReturn(300, 100);
            case "打8折":
                return new CashRebate(0.8);
        }
        return null;
    }
}
