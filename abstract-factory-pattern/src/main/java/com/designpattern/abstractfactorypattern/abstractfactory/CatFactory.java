package com.designpattern.abstractfactorypattern.abstractfactory;

import com.designpattern.abstractfactorypattern.*;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class CatFactory extends AnimalFactory {

    @Override
    protected IAnimal createAnimal() {
        return new Cat();
    }

    @Override
    protected IAge createAge() {
        return new CatAge();
    }

    @Override
    protected IName createName() {
        return new CatName();
    }
}
