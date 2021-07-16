package com.gff.zy;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        // 创建一个List集合，并添加元素0-9
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        System.out.println(list);
        //将集合转换为一个Integer数组并输出数组每一个元素
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i <= 9 ; i++) {
            A.add(Integer.valueOf(list.get(i)));
        }
        System.out.println("A =" +A);
    }
}

