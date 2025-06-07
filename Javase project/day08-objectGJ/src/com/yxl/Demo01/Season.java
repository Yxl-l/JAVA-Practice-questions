package com.yxl.Demo01;

public enum Season {
    /*
    枚举类：是一个特殊的Java类
    语法：
        public enum 枚举名{
            //第一句定义表示枚举对象的几个名称，一个名称表示一个枚举对象
            //从第二句开始，可以定义类的其他成员(成员变量、成员方法、构造器)
        }
    注意事项：
        1 枚举类的第一句只能罗列一些名称，这些名称都是常量，并且每个常量会记住枚举类的一个对象。
        2 枚举类中，从第二句(行)开始，可以定义类的其他各种成员(成员变量、成员方法、构造器)。
        3 枚举类的构造器都是私有的（写不写都只能是私有的），因此，枚举类对外不能创建对象。
        4 编译器为枚举类新增了几个静态方法，用于获取所有枚举对象或者某个枚举对象。

    需求：定义一个枚举类，表示季节。季节有：春季(spring)、夏季(summer)、秋季(autumn)、冬季(winter)。
 */
        SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");
        private String name;
        private Season(){
        }
        private Season(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Season{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

