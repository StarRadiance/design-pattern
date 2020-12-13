package com.designpattern.singleton.threadlcal;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class ExecutorThread implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
