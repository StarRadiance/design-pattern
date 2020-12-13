package com.designpattern.interpreter.calculate;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class MulInterpreter extends Interpreter {

    public MulInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }
}
