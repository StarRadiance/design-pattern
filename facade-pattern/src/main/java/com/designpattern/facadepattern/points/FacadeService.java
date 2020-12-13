package com.designpattern.facadepattern.points;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class FacadeService {
    private PaymentService paymentService = new PaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShoppingService shoppingService = new ShoppingService();

    public void exchange(GiftInfo giftInfo) {
        if (qualifyService.isAvailable(giftInfo)) {
            if(paymentService.pay(giftInfo)){
                String shippingNo = shoppingService.delivery(giftInfo);
                System.out.println("物流系统下单成功，物流单号是：" + shippingNo);
            }
        }
    }
}
