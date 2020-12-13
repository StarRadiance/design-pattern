package com.designpattern.interpreter.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description: 抽象表达式
 */
public interface IExpression {

    // 对表达式进行解释
    Object interpret(Context context);
}
