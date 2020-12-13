package com.designpattern.decoratorpattern.pancake.v2;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class SausageDecorator extends PancakeDecorator {

    public SausageDecorator(BasePancake basePancake) {
        super(basePancake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1根香肠";
    }

    @Override
    protected Double getPrice() {
        return super.getPrice() + 1;
    }
}
