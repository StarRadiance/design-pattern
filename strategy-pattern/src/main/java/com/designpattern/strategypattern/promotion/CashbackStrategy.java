package com.designpattern.strategypattern.promotion;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class CashbackStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
