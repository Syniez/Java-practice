package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ArrayList 메소드 연습 실습
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

        Mylist.add(2, "제롬");
        System.out.println(Mylist);
        System.out.println("저장 사이즈 : " + Mylist.size());

        Mylist.add("봉이");
        System.out.println(Mylist);
        System.out.println("저장 사이즈 : " + Mylist.size());

        Mylist.remove(0);
        System.out.println(Mylist);

        Mylist.set(2, "길동");
        System.out.println(Mylist);

        // for loop를 이용한 출력
        for (int i = 0; i < Mylist.size(); i++)
            System.out.println(Mylist.get(i));

        // 확장 for loop를 이용한 출력
        for (String a:Mylist)
            System.out.println(a);

        // Iterator를 이용한 출력
        Iterator <String> itrinfo = Mylist.iterator();
        while(itrinfo.hasNext())
            System.out.println(itrinfo.next());

        // --------------------------------------------------------------------------------

        // String array 에서 ArrayList로 변환
        String[] arr = new String[] {"채송화", "금잔화", "다알리아"};
        List <String> Myflower = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\n\n" + "리스트 변환 결과 : " + Myflower);
        Myflower.set(2, "패랭이꽃");
        Myflower.add(0, "마가렛트");
        System.out.println("수정 후 리스트 변환결과 : " + Myflower);

        // Intefer array로 Arraylist 만들기
        int[] arr2 = {100, 200, 300, 400};
        List <Integer> Mynum = new ArrayList<>();
        for (int a:arr2)
            Mynum.add(a);
        Mynum.add(2, 250);
        System.out.println("\n\n" + "수정 후 리스트 변환결과 : " + Mynum);
    }
}