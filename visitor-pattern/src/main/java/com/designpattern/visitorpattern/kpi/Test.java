package com.designpattern.visitorpattern.kpi;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("==========CEO看报表===============");
        report.showReport(new CEOVisitor());
        System.out.println("==========CTO看报表===============");
        report.showReport(new CTOVisitor());
    }
}
