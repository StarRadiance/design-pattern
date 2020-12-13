package com.designpattern.visitorpattern.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class ObjectStructure {

    private List<IElement> list = new ArrayList<>();

    {
        list.add(new ConcreteElementA());
        list.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        for (IElement element : list) {
            element.accept(visitor);
        }
    }
}
