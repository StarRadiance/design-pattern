package easyfactory.factory;

import easyfactory.Dog;
import easyfactory.IAnimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class DogFactory implements AnimalFactory {

    @Override
    public IAnimal create() {
        return new Dog();
    }
}
