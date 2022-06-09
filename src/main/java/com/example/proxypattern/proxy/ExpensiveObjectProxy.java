package com.example.proxypattern.proxy;

import com.example.proxypattern.expensive.object.ExpensiveObject;
import com.example.proxypattern.expensive.object.ExpensiveObjectImpl;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}