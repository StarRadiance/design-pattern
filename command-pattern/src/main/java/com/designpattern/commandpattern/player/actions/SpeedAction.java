package com.designpattern.commandpattern.player.actions;

import com.designpattern.commandpattern.player.IAction;
import com.designpattern.commandpattern.player.Player;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class SpeedAction implements IAction {

    private Player player;

    public SpeedAction(Player player) {
        this.player = player;
    }

    public void execute() {
        player.speed();
    }
}
