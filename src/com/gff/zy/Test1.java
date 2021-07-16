package com.gff.zy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        //给c1赋值
        c1.add("one");
        c1.add("two");
        c1.add("three");
        //给c2赋值
        c2.add("four");
        c2.add("five");
        c2.add("six");
        //合并集合
        c1.addAll(c2);
        //循环输出看结果
        for (Object s : c1) {
            System.out.println(s);
        }
        Collection c3 = new ArrayList();
        c3.add("one");
        c3.add("five");
        //是否包含
        System.out.println("集合c1中是否包含c3的所有元素" + c1.containsAll(c3));
         c1.removeAll(Collections.singleton("two"));
        System.out.println(c1);

    }
}

