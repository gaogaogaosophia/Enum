package com.company;

//从反编译的Main$Day文件来看，枚举类Day继承了Enum类，所以不能再继承其他类；但是可以实现接口也是final的，不能被继承

/**
 * 通过源码看，enum有构造函数，但是只能由编译器调用
 * 实际上使用关键字enum定义的枚举类，除了不能使用继承，可以当做常规类使用，可以添加变量和方法，甚至是main方法
 */
public class Main {

    public static void main(String[] args) {
        //直接引用
        Day day = Day.FRIDAY;
        //创建枚举数组
        Day[] days = new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY,Day.SUNDAY};
        //返回枚举顺序值（它在枚举声明中的位置，其中初始常量序数为零
        for (int i = 0; i < days.length; i++) {
            System.out.println("day["+ i + "].ordinal():"+days[i].ordinal());
        }
        System.out.println("-------------------------------------");
        //通过compareTo()方法比较，其实其内部是通过ordinal值比较的
        System.out.println("days[0].compareTo(days[1]):"+days[0].compareTo(days[1]));
        System.out.println("days[0].compareTo(days[2]):"+days[0].compareTo(days[2]));
        System.out.println("-------------------------------------");
        //获取该枚举对象的class对象引用
        Class<?> clazz = days[0].getDeclaringClass();
        System.out.println("class:" + clazz);
        System.out.println("-------------------------------------");
        //name()返回此枚举常量的名称
        System.out.println("days[0].name:" + days[0].name());
        System.out.println("days[1].name:" + days[1].name());
        System.out.println("days[2].name:" + days[2].name());
        System.out.println("days[3].name:" + days[3].name());
        System.out.println("-------------------------------------");
        //返回枚举常量的名称
        System.out.println("days[0].toString():" + days[0].toString());
        System.out.println("days[1].toString():" + days[1].toString());
        System.out.println("days[2].toString():" + days[2].toString());
        System.out.println("days[3].toString():" + days[3].toString());
        System.out.println("-------------------------------------");
        Day d1 = Enum.valueOf(Day.class, days[0].name());
        Day d2 = Enum.valueOf(Day.class, days[1].name());
        System.out.println("d1:" + d1);
        System.out.println("d2:" + d2);
        System.out.println("-------------------------------------");
        //values和valueOf的不同,values()方法和valueOf(String name)方法是编译器生成的static方法
        Day[] days1 = Day.values();
        System.out.println("Day.values():" + days1);
        Day days2 = Day.valueOf("MONDAY");
        System.out.println("Day.valueOf():"+days2);
    }

    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
