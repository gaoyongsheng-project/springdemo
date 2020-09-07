package com.example.designPatterns;

public class SingletonLazy {


    /**
     * 实例化私有静态引用
     */
    private static SingletonLazy singletonLazy;

    /**
     * 私有的构造方法
     */
    private SingletonLazy() {

    }

    /**
     * 以自己实例为返回值的静态的公有方法，静态工厂方法
     *
     * @return
     */
    public SingletonLazy getSingletonLazy() {
        //被动创建，在真正需要使用时才去创建
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

}
