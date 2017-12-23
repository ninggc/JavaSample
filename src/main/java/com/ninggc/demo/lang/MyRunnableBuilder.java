package com.ninggc.demo.lang;

public class MyRunnableBuilder {
    private ThreadDemo.Callback callback;

    public MyRunnableBuilder setCallback(ThreadDemo.Callback callback) {
        this.callback = callback;
        return this;
    }

    public ThreadDemo.MyRunnable createMyRunnable() {
        return new ThreadDemo.MyRunnable(callback);
    }
}