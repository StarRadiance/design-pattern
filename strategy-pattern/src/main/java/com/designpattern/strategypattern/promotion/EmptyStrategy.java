package com.designpattern.strategypattern.promotion;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class EmptyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
