package com.designpattern.strategypattern.pay.payport;

import com.designpattern.strategypattern.pay.MsgResult;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public abstract class Payment {

    public abstract String getName();

    //通用逻辑放到抽象类里面实现
    public MsgResult pay(String uid, double amount){
        //余额是否足够
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额" + amount);
    }

    protected abstract double queryBalance(String uid);
}
