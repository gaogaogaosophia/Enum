package com.company;

/**
 * 1.向enum类中添加自定义构造函数和方法
 * 2.方法覆盖：父类Enum中的定义的方法只有toString方法没有使用final修饰，因此只能覆盖toString方法
 */
public enum EnumDemo2 {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WENDAY("星期三"),
    THURADAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");//枚举实例要用分号结束

    private String description;

    /**
     * 私有构造函数，防止被外部调用
     * @param string
     */
    private EnumDemo2(String string) {
        this.description = string;
    }

    /**
     * set方法
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * get方法
     * @return
     */
    public void setDescription(String string) {
        this.description = string;
    }


    public static void main(String[] args) {
        for (EnumDemo2 day2 : EnumDemo2.values()) {
            System.out.println("name:"+day2.name()+",description:"+day2.getDescription());
        }
    }

    @Override
    public String toString() {
        return description;
    }
}
