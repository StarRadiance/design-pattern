package com.designpattern.strategypattern.promotion;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity activity = new PromotionActivity(new GroupBuyStrategy());
        activity.doPromotion();

        String promotionKey = "COUPON";
        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
