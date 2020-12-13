package com.designpattern.abstractfactorypattern.abstractfactory;


import com.designpattern.abstractfactorypattern.*;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 动物工厂抽象类
 */
public abstract class AnimalFactory {

    protected abstract IAnimal createAnimal();

    protected abstract IAge createAge();

    protected abstract IName createName();
}
