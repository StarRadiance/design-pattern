package com.designpattern.facadepattern.general;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description: 外观角色
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    /**
     * 对外接口
     */
    public void doA() {
        subSystemA.doA();
    }

    /**
     * 对外接口
     */
    public void doB() {
        subSystemB.doB();
    }

    /**
     * 对外接口
     */
    public void doC() {
        subSystemC.doC();
    }
}
