package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> Mylist = new ArrayList<>();
        Mylist.add("미고");
        Mylist.add("도이");
        Mylist.add("봉이");
        System.out.println(Mylist);

        //Mylist.add(100);
        //Mylist.add(200);
        //System.out.println(Mylist);

        System.out.println(Mylist.get(1));
        System.out.println("저장 사이즈 : " + Mylist.size());

        Mylist.add("슈슈");
        System.out.println(Mylist);
    }
}