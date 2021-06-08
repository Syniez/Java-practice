package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> Mymap = new HashMap<>();
        Mymap.put("블루베리", 23500);
        Mymap.put("생크림", 23500);
        Mymap.put("크린베리호두", 23500);
        Mymap.remove("생크림");
        System.out.println("케익 목록 : " + Mymap);
        System.out.println("가격정보 : " + Mymap.get("크린베리호두"));

        // --------------------------------------------------------------------------------

        Map<String, Integer> Mymap2 = new HashMap<>();
        Mymap2.put("블루베리", 23500);
        Mymap2.put("생크림", 23500);
        Mymap2.put("크린베리호두", 23500);
        Mymap2.put("요거트호두", 18500);
        Mymap2.put("치즈케익", 22000);
        System.out.println("키값 : " + Mymap2.keySet());
        //System.out.println("키값 : " + Mymap2.entrySet());

        int i = 0;
        for (String k:Mymap2.keySet()) {
            i += 1;
            System.out.println(i + "번 상품의 가격정보 : " + Mymap2.get(k));
        }

        Iterator <String> itrinfo = Mymap2.keySet().iterator();
        while(itrinfo.hasNext()) {
            String k = itrinfo.next();
            System.out.println("케익명 : " + k + " " + Mymap2.get(k));
        }
    }
}