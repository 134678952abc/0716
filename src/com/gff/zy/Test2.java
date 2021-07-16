package com.gff.zy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("1");
        c1.add("$");
        c1.add("2");
        c1.add("$");
        c1.add("3");
        c1.add("$");
        c1.add("4");
        for (Object s : c1) {
            c1.removeAll(Collections.singleton("$"));
        }
        System.out.println(c1);
    }
}

