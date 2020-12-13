package com.designpattern.interpreter.calculate;

import java.util.Stack;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class MyCalculator {

    private Stack<IArithmeticInterpreter> stack = new Stack<>();

    public MyCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String [] elements = expression.split(" ");
        IArithmeticInterpreter leftExpr, rightExpr;

        for (int i = 0; i < elements.length ; i++) {
            String operator = elements[i];
            if (OperatorUtil.isOperator(operator)){
                leftExpr = this.stack.pop();
                rightExpr = new NumInterpreter(Integer.valueOf(elements[++i]));
                System.out.println("出栈: " + leftExpr.interpret() + " 和 " + rightExpr.interpret());
                this.stack.push(OperatorUtil.getInterpreter(leftExpr, rightExpr,operator));
                System.out.println("应用运算符: " + operator);
            }
            else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[i]));
                this.stack.push(numInterpreter);
                System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }

    public int calculate() {
        return stack.pop().interpret();
    }
}
