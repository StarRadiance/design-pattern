package com.designpattern.visitorpattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public interface IElement {

    void accept(IVisitor visitor);
}
