package com.company;

/**
 * 枚举与switch
 * 枚举型确实也被switch所支持
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        print(Color.RED);
        print(Color.GREEN);
        print(Color.BLUE);
    }
    public static void print(Color color){
        switch (color) {
            case RED://无需使用color进行引用
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                break;
        }
    }
}
enum Color{
    RED,GREEN,BLUE
}
