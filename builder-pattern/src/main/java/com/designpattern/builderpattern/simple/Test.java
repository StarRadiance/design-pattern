package com.designpattern.builderpattern.simple;

import java.math.BigDecimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        builder.addName("小明");
        builder.addAge(18);
        builder.addSex('男');
        builder.addHeight(BigDecimal.valueOf(185));
        builder.addWeight(BigDecimal.valueOf(135));
    }
}
