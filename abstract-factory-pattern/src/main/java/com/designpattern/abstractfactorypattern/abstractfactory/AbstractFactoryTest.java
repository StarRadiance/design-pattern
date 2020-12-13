package com.designpattern.abstractfactorypattern.abstractfactory;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AnimalFactory factory = new CatFactory();
        factory.createAnimal().description();
        factory.createName().name();
        factory.createAge().age();
    }
}
