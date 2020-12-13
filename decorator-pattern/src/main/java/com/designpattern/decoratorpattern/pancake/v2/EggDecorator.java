package com.designpattern.decoratorpattern.pancake.v2;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class EggDecorator extends PancakeDecorator {

    public EggDecorator(BasePancake basePancake) {
        super(basePancake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected Double getPrice() {
        return super.getPrice() + 2;
    }
}
