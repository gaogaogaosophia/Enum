package com.company;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * EnumMap专门为枚举类型定做的Map实现
 * 1.EnumMap要求Key类型必须为Enum：其源码中有typeCheck方法，用于Key的类型检测，若Key不为enum类型，则抛出异常
 * 2.EnumMap的key值不能为null
 * 3.EnumMap保证Key顺序与枚举中的顺序一致
 * 4.由于枚举类型实例的数量相对固定并且有限，所以EnumMap使用数组来存放与枚举类型对应的值，因此效率会更高
 */
public class EnumMapDemo {
    private static class Clothes {
        String num;
        Color color;
        public Clothes(String num,Color color){
            this.num = num;
            this.color = color;
        }
        public Color getColor(){
            return this.color;
        }
    }
    enum Color{
        RED,GREEN,BLUE,YELLOW
    }

    public static void main(String[] args) {
        List<Clothes> list = new ArrayList<>();
        list.add(new Clothes("A01", Color.RED));
        list.add(new Clothes("A02", Color.BLUE));
        list.add(new Clothes("A03", Color.GREEN));
        Map<Color, Integer> enumMap = new EnumMap<Color, Integer>(Color.class);
        for (Clothes clothes : list) {
            Color color = clothes.getColor();
            Integer count = enumMap.get(color);
            if (count != null) {
                enumMap.put(color, count + 1);
            } else {
                enumMap.put(color, 1);
            }
        }
        System.out.println(enumMap.toString());
    }
    /**
     * 输出：符合第三点Key顺序与枚举中的顺序一致
     * {RED=3, GREEN=3, BLUE=2, YELLOW=2}
     */
}
