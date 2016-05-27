package com.jiesen.pattern.strategy;

import java.io.IOException;

/**
 * 示例：在这里调用的时候，只要认识CashContext一个类。
 * Created by sen on 16-5-23.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        double total = 0;
        CashContext cashContext;

        cashContext = new CashContext("正常收费");
        double price = cashContext.getResult(1000 * 5);
        System.out.println("单价：1000、数量：5、小计："+price+" 正常收费 ");
        total += price;

        cashContext = new CashContext("打8折");
        price = cashContext.getResult(100 * 10);
        System.out.println("单价：100、数量：10、小计："+price+" 打8折 ");
        total += price;

        cashContext = new CashContext("満300返100");
        price = cashContext.getResult(700 * 1);
        System.out.println("单价：700、数量：1、小计："+price+" 満300返100 ");
        total += price;

        System.out.println("合计："+total);
    }
}
