package com.company;

/**
 * 枚举单例，不用考虑序列化和反射带来的问题
 * 不能用反射创建枚举类
 * 在android开发中，内存优化是个大块头，而使用枚举时占用的内存常常是静态变量的两倍还多，因此android官方在内存优化方面给出的建议是尽量避免在android中使用enum
 */
public class EnumSingleton{

    //构造函数为私有
    private EnumSingleton(){

    }

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.singleton;
    }

    private enum Singleton{
        INSTANCE;
        private EnumSingleton singleton;
        //jvm保证此方法只会调用一次
        Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }

    //测试
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();
        System.out.println("enumSingleton1 == enumSingleton2 ? " + (enumSingleton1 == enumSingleton2));
    }
}