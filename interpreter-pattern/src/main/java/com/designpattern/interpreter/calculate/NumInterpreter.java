package com.designpattern.interpreter.calculate;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class NumInterpreter implements IArithmeticInterpreter {

    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
