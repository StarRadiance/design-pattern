package com.designpattern.proxypattern.dynamicproxy.cglibproxy;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/6
 * @Description:
 */
public class CglibTest {

    public static void main(String[] args) {
        try {
            Customer customer = (Customer)new CglibMeiPo().getInstance(Customer.class);
            customer.finaLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
