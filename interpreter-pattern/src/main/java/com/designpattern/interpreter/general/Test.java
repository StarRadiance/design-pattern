package com.designpattern.interpreter.general;

import java.util.Stack;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        try {
            Context context = new Context();
            // 定义一个语法容器，用于存储一个具体表达式
            Stack<IExpression> stack = new Stack<>();
            stack.push(new TerminalExpression());
            // 获取得到最终的解析表达式：完整语法树
            IExpression expression = stack.pop();
            // 递归调用获取结果
            expression.interpret(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
