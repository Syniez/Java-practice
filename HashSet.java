package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> Myset = new HashSet<>();
        Myset.add("미고");
        Myset.add("도이");
        Myset.add("봉이");
        Myset.add("봉이");
        System.out.println("항목 : " + Myset);
        System.out.println("원소 갯수 : " + Myset.size());

        //Myset.remove("도이");
        //System.out.println("항목 : " + Myset);

        if (Myset.contains("도이") == true)
            System.out.println("도이는 존재하는 항목입니다");

        // --------------------------------------------------------------------------

        String[] arr = {"미고", "도이", "봉이"};
        Set<String> Sample = new HashSet<>();
        for (String a:arr)
            Sample.add(a);
        System.out.println("\n\n" + "Sample 요소 : " + Sample);

        Set<String> Myset2 = new HashSet<>();
        Myset2.add("미고");
        Myset2.add("도이");
        Myset2.add("봉이");
        Myset2.add("봉이");

        System.out.println("Sample 요소의 코드 : " + Sample.hashCode());
        System.out.println("Myset2요소의 코드 : " + Myset2.hashCode());
        System.out.println("두 객체가 같은지 여부 : " + (Sample == Myset2));
        System.out.println("두 객체가 같은지 여부 : " + Myset2.equals(Sample));

    }
}