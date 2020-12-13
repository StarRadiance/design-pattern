package com.designpattern.strategypattern.promotion;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class PromotionActivity {

    private IPromotionStrategy iPromotionStrategy;

    public PromotionActivity(IPromotionStrategy iPromotionStrategy) {
        this.iPromotionStrategy = iPromotionStrategy;
    }

    public void doPromotion() {
        iPromotionStrategy.doPromotion();
    }
}
