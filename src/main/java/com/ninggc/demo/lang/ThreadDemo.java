package com.ninggc.demo.lang;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {
    public static void main(String[] args) {
        showThreadInfo();
    }

    private static void showThreadInfo() {
        String message = " in main ";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                5,
                1000,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(5));
        Callback callback = new Callback() {
            @Override
            public void onResult(String msg) {
                System.out.println("onResult id is " + msg + message);
            }
        };
        threadPoolExecutor.execute(new MyRunnableBuilder().setCallback(callback).createMyRunnable());
        threadPoolExecutor.execute(new MyRunnableBuilder().setCallback(callback).createMyRunnable());
        threadPoolExecutor.execute(new MyRunnableBuilder().setCallback(callback).createMyRunnable());
    }

    interface Callback {
        void onResult(String msg);
    }

    static class MyRunnable implements Runnable {

        static int count = 0;
        final int id = count++;
        Callback callback;

        public MyRunnable(Callback callback) {
            this.callback = callback;
        }

        @Override
        public void run() {
            run(callback);
            callback.onResult(String.valueOf(id));
        }

        public void run(Callback callback) {
            for (int i = 0; i < 5; i++) {
                System.out.println("id: " + id + id + " show " + i);
//                Thread.yield();
            }
        }
    }

    static class MyThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    }
}
