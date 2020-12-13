package com.designpattern.strategypattern.promotion;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class GroupBuyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
