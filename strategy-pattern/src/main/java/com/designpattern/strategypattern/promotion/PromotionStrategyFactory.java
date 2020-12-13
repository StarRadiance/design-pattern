package com.designpattern.strategypattern.promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/9
 * @Description:
 */
public class PromotionStrategyFactory {

    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<String,IPromotionStrategy>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    private PromotionStrategyFactory(){}

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }
    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }
}
