package com.example.threadpool;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo implements Runnable{

    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> queue=new ArrayBlockingQueue<>(12);

        //LinkedBlockingDeque<Runnable> queue=new LinkedBlockingDeque<Runnable>(12);

        ThreadPoolExecutor threadPool=new ThreadPoolExecutor(4,8,60, TimeUnit.SECONDS, queue);
        for(int i=0;i<30;i++){
            threadPool.execute(new Thread(new ThreadPoolDemo(),"thread".concat(i+"")));
            if(queue.size()>0){
                System.out.println("阻塞队列有线程了，队列中阻塞的线程数量:"+queue.size()+",执行任务的线程数量:"+threadPool.getActiveCount());
            }
            System.out.println("线程中当前的线程数量:"+threadPool.getPoolSize());
        }
        threadPool.shutdown();
    }

    @Override
    public void run() {

    }
}
