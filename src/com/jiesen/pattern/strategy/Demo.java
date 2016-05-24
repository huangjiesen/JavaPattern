package com.jiesen.pattern.strategy;

import java.io.IOException;

/**
 *
 * Created by sen on 16-5-23.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        double total = 0;
        Cash cash;

        cash = CashFactory.getCash("正常收费");
        double price = cash.acceptCash(1000 * 5);
        System.out.println("单价：1000、数量：5、小计："+price+" 正常收费 ");
        total += price;

        cash = CashFactory.getCash("打8折");
        price = cash.acceptCash(100 * 10);
        System.out.println("单价：100、数量：10、小计："+price+" 打8折 ");
        total += price;

        cash = CashFactory.getCash("満300返100");
        price = cash.acceptCash(700 * 1);
        System.out.println("单价：700、数量：1、小计："+price+" 満300返100 ");
        total += price;

        System.out.println("合计："+total);
    }
}
