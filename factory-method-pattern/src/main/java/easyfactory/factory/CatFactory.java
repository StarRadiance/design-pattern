package easyfactory.factory;

import easyfactory.Cat;
import easyfactory.IAnimal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class CatFactory implements AnimalFactory {

    @Override
    public IAnimal create() {
        return new Cat();
    }
}
