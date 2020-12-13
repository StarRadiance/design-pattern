package com.designpattern.commandpattern.player;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class Controller {

    private List<IAction> list = new ArrayList<>();

    public void addAction(IAction action) {
        list.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        for (IAction action : list) {
            action.execute();
        }
        list.clear();
    }
}
