package com.designpattern.decoratorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        //相应的功能处理
        System.out.println("处理业务逻辑");
    }
}
