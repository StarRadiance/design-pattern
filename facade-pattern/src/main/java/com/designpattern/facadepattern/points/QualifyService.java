package com.designpattern.facadepattern.points;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class QualifyService {

    public boolean isAvailable(GiftInfo giftInfo){
        System.out.println("校验" +giftInfo.getName() + "积分通过,库存通过。");
        return true;
    }
}
