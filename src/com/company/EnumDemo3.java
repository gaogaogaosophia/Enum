package com.company;

/**
 * 1.为枚举类定义抽象方法，每个【枚举实例】均可以实现该方法，以便产生不同的行为;
 * 2.但是枚举类型的实例终究不能作为类型传递使用
 * 3.实现接口
 */
public enum EnumDemo3 implements food,sport{
    FIRST{
        @Override
        public String getInfo() {
            return "FIRST TIME";
        }
    },
    SECOND{
        @Override
        public String getInfo() {
            return "SECOND TIME";
        }
    };

    /**
     * 定义抽象方法
     * @return
     */
    public abstract String getInfo();

    public static void main(String[] args){
        System.out.println("First Example：" + EnumDemo3.FIRST.getInfo());
        System.out.println("Second Example："+EnumDemo3.SECOND.getInfo());
    }

    @Override
    public void eat() {
        System.out.println("eat......");
    }

    @Override
    public void run() {
        System.out.println("run......");
    }
}
interface food{
    void eat();
}
interface sport{
    void run();
}