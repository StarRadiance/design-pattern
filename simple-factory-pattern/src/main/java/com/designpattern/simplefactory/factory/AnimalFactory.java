package com.designpattern.simplefactory.factory;

import com.designpattern.simplefactory.Cat;
import com.designpattern.simplefactory.Dog;
import com.designpattern.simplefactory.IAnimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description: 动物工厂类
 */
public class AnimalFactory {

    public IAnimal create(String name){
        if("car".equals(name)){
            return new Cat();
        }else if("dog".equals(name)){
            return new Dog();
        }else {
            return null;
        }
    }

    public IAnimal create(Class<? extends IAnimal> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
