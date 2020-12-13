package com.designpattern.decoratorpattern.pancake.v2;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class PancakeDecorator extends BasePancake {

    private BasePancake basePancake;

    public PancakeDecorator(BasePancake basePancake) {
        this.basePancake = basePancake;
    }

    @Override
    protected String getMsg() {
        return this.basePancake.getMsg();
    }

    @Override
    protected Double getPrice() {
        return this.basePancake.getPrice();
    }
}
