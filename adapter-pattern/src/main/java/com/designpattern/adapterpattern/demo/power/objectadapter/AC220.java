package com.designpattern.adapterpattern.demo.power.objectadapter;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电压" + output + "V");
        return output;
    }
}
