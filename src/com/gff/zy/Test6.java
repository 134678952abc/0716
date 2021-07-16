package com.gff.zy;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        //创建list集合
        List<String> s = new ArrayList<>();
        //创建字符串数组
        String[] a= {"one","two","three"};
        //转换
        for (int i = 0; i <a.length; i++) {
            s.add(a[i]);
        }
        System.out.println(s);
    }
}

