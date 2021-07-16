package com.gff.zy;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //生成10个不同的随机数。可以使用Collection自带的contains()方法
        int ran = (int)(Math.random()*100) +1;
        list.add(0,ran);//初始化list
        for (int i = 0; i < 9; i++) {//正要添加的数
            ran = (int)(Math.random()*100) +1;
            for (int j = 0; j < i; j++) {//表示已添加的数
                if(ran == list.get(j)) {//如果重复，重新生成，并再次比较
                    ran = (int)(Math.random()*100) +1;
                    j = -1;//需要与j之前的，再次比较，因为上一个与j之前的不同，但是当前随机数不一定
                }
            }
            list.add(ran);
            Collections.sort(list);

        }
        System.out.println(list);
    }
}

