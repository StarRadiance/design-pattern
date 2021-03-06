package com.designpattern.strategypattern.pay.payport;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
