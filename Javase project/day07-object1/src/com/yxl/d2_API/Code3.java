package com.yxl.d2_API;

import java.util.Arrays;

/*
    字符串的常用方法：
    //1.public int length()：获取字符串的长度返回（就是字符个数）
    //2.public char charAt(int index)：获取某个索引位置处的字符返回
    //3.public char[] toCharArray()：将当前字符串转换成字符数组返回
    //4.public boolean equals(Object anObject)：判断当前字符串与另一个字符串的内容一样，一样返回true
    //5.public boolean equalsIgnoreCase(String anotherString)：判断当前字符串与另一个字符串的内容是否一样(忽略大小写)
    //6.public String substring(int beginIndex, int endIndex)：根据开始和结束索引进行截取，得到新的字符串（包前不包后）
    //7.public String substring(int beginIndex)：从传入的索引处截取，截取到末尾，得到新的字符串返回
    //8.public String replace(CharSequence target, CharSequence replacement)：使用新值，将字符串中的旧值替换，得到新的字符串
    //9.public boolean contains(CharSequence s)：判断字符串中是否包含了某个字符串
    //10.public boolean startsWith(String prefix)：判断字符串是否以某个字符串内容开头，开头返回true，反之返回false
    //11.public String[] split(String regex)：把字符串按照指定字符串内容进行分割，并返回字符串数组回来

 */
public class Code3 {

    /*
    String类：代表字符串对象，该对象提供了很多操作字符串的方法。
    创建对象：
        方式一：直接赋值
            String s = "hello";
        方式二：使用构造方法创建对象，也就是new对象。
            //public String() 创建一个空白字符串对象，不含有任何内容
            //public String(String original) 根据传入的字符串内容，来创建字符串对象
            //public String(char[] chars) 根据字符数组的内容，来创建字符串对象
            //public String(byte[] bytes)根据字节数组的内容，来创建字符串对象
 */
    public static void main(String[] args) {
        String s="2e3e hello 我的";
        System.out.println(s);

        String s2=new String();
        System.out.println("s2="+s2);
        //public String() 创建一个空白字符串对象，不含有任何内容
        int s11111=s.length();
        System.out.println(s11111);

        //2.public char charAt(int index)：获取某个索引位置处的字符返回
        char a =s.charAt(3);
        System.out.println(a);

        //3.public char[] toCharArray()：将当前字符串转换成字符数组返回
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        //4.public boolean equals(Object anObject)：判断当前字符串与另一个字符串的内容一样，一样返回true
        boolean t = s.equals("2e3e hello 我的");
        System.out.println(t);
        //5.public boolean equalsIgnoreCase(String anotherString)：判断当前字符串与另一个字符串的内容是否一样(忽略大小写)
        boolean tt = s.equalsIgnoreCase("2e3E hello 我的");
        System.out.println(tt);
        //6.public String substring(int beginIndex, int endIndex)：根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        String s3 = s.substring(2, 5);
        System.out.println(s3);
        //7.public String substring(int beginIndex)：从传入的索引处截取，截取到末尾，得到新的字符串返回
        //8.public String replace(CharSequence target, CharSequence replacement)：使用新值，将字符串中的旧值替换，得到新的字符串
        //9.public boolean contains(CharSequence s)：判断字符串中是否包含了某个字符串
        //10.public boolean startsWith(String prefix)：判断字符串是否以某个字符串内容开头，开头返回true，反之返回false
        //11.public String[] split(String regex)：把字符串按照指定字符串内容进行分割，并返回字符串数组回来

    }
}
