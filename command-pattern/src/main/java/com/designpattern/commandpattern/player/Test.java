package com.designpattern.commandpattern.player;

import com.designpattern.commandpattern.player.actions.PauseAction;
import com.designpattern.commandpattern.player.actions.PlayAction;
import com.designpattern.commandpattern.player.actions.SpeedAction;
import com.designpattern.commandpattern.player.actions.StopAction;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Player player = new Player();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));
        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.executes();
    }
}
