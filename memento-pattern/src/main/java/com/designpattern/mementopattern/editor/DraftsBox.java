package com.designpattern.mementopattern.editor;

import java.util.Stack;

/**
 * @Author: ShaoJiaQing
 * @Date: 2020/12/13
 * @Description:
 */
public class DraftsBox {
    private static final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return STACK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }
}
