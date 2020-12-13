package com.designpattern.builderpattern.chain;

import java.math.BigDecimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        builder.addName("小明")
                .addAge(18)
                .addSex('男')
                .addHeight(BigDecimal.valueOf(185))
                .addWeight(BigDecimal.valueOf(135));
    }
}
