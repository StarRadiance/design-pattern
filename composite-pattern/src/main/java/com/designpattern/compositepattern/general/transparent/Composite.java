package com.designpattern.compositepattern.general.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Composite extends Component {

    private List<Component> componentList;

    public Composite(String name) {
        super(name);
        this.componentList = new ArrayList<>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component : this.componentList) {
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    public boolean addChild(Component component) {
        return this.componentList.add(component);
    }

    public boolean removeChild(Component component) {
        return this.componentList.remove(component);
    }

    public Component getChild(int index) {
        return this.componentList.get(index);
    }
}
