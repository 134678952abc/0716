package com.gff.zy;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //存放数据
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        //获取第二个元素
        System.out.println("获取第二个数据:" + list.get(1));
        //将集合第三个元素设置为"3"
        list.set(2,"3");
        System.out.println(list.get(2));
        //在集合第二个位置上插入元素"2"
        list.add(1,"2");
        System.out.println("list =" + list);
        //删除集合第三个元素。
        list.remove(2);
        System.out.println("list =" + list);

    }
}

