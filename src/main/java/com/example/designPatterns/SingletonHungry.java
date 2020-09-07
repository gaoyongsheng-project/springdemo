package com.example.designPatterns;

/**
 * 饿汉单例模式-立即加载
 */
public class SingletonHungry {

    /**
     * 静态私有创建实例
     */
    private static SingletonHungry singletonHungry = new SingletonHungry();

    /**
     * 私有的构造方法
     */
    private SingletonHungry() {
    }

    /**
     * 以自己实例为返回值的静态的公有方法，静态工厂方法
     *
     * @return
     */
    private static SingletonHungry getSingletonHungry() {
        return singletonHungry;
    }

}
