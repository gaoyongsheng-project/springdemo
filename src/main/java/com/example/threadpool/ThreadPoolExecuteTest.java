package com.example.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecuteTest {

    //参考 https://my.oschina.net/sunjun/blog/9017
    /*corePoolSize：线程池维护线程的最少数量
    maximumPoolSize：线程池维护线程的最大数量
    keepAliveTime： 线程池维护线程所允许的空闲时间
    unit： 线程池维护线程所允许的空闲时间的单位
    workQueue： 线程池所使用的缓冲队列
    handler： 线程池对拒绝任务的处理策略*/
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 20; i++) {
            executor.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(String.format("thread %d finished", this.hashCode()));
                }
            });
        }
        executor.shutdown();
    }
}
