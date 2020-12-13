package com.designpattern.facadepattern.points;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class ShoppingService {

    public String delivery(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
