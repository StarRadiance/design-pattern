package com.designpattern.visitorpattern.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class BusinessReport {

    private List<Employee> employees = new ArrayList<>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Engineer("程序员A"));
        employees.add(new Engineer("程序员B"));
        employees.add(new Engineer("程序员C"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("程序员D"));
    }

    public void showReport(IVisitor visitor){
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
