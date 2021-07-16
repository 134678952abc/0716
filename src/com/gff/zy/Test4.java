package com.gff.zy;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        //创建一个List集合并添加元素0-9
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        //获取子集[3,4,5,6]
        List<Integer> s = list.subList(3,7);
        System.out.println(s);
        //将子集元素扩大10倍
        for (int i = 0; i <s.size(); i++) {
            s.set(i,list.get(i)*10);
        }
        //输出原集合。
        System.out.println("list =" + list);
        //删除集合中的[7,8,9]
        list.subList(7,9).clear();
        System.out.println(list);

    }
}

