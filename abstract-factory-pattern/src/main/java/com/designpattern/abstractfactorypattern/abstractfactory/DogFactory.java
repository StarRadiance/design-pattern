package com.designpattern.abstractfactorypattern.abstractfactory;

import com.designpattern.abstractfactorypattern.*;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class DogFactory extends AnimalFactory {

    @Override
    protected IAnimal createAnimal() {
        return new Dog();
    }

    @Override
    protected IAge createAge() {
        return new DogAge();
    }

    @Override
    protected IName createName() {
        return new DogName();
    }
}
