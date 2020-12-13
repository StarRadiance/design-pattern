package com.designpattern.commandpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class ConcreteCommand implements ICommand {
    // 直接创建接收者，不暴露给客户端
    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.action();
    }
}
