package com.designpattern.facadepattern.points;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PaymentService {

    public boolean pay(GiftInfo giftInfo){
        System.out.println("扣减" + giftInfo.getName() + " 积分成功");
        return true;
    }
}
