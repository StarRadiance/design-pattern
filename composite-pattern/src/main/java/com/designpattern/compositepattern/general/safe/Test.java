package com.designpattern.compositepattern.general.safe;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/7
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        // 根节点
        Composite root = new Composite("root");
        // 树枝节点A
        Composite branchA = new Composite("--branchA");
        // 树枝节点B
        Composite branchB = new Composite("--branchB");
        // 叶子节点
        Component leafA = new Leaf("----leafA");
        Component leafB = new Leaf("----leafB");
        Component leafC = new Leaf("----leafC");

        root.addChild(branchA);
        root.addChild(leafC);

        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);
    }
}
