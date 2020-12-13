package com.designpattern.interpreter.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description: 终结符表达式
 */
public class TerminalExpression implements IExpression {

    @Override
    public Object interpret(Context context) {
        // 实现文法中与终结符有关的操作
        context.put("","");
        return null;
    }
}
