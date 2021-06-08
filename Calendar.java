package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 기본 join
        String join1 = String.join(",", "아메리카노", "카페라떼", "카페모카");
        System.out.println("결과 ==> " + join1);

        // 배열에서 join
        String[] arr = {"아메리카노", "카페라떼", "카페모카"};
        String coffee = String.join("/", arr);
        System.out.println("결과 ==> " + coffee);

        // List
        List<String> arr2 = Arrays.asList("아메리카노", "카페라떼", "카페모카");
        String coffee2 = String.join("*", arr2);
        System.out.println("결과 ==> " + coffee2 + "\n");

        // ---------------------------------------------------------------------------

        Date now = new Date();
        System.out.println("현재 날짜 = " + now);

        Calendar cal = Calendar.getInstance();
        cal.add(cal.DATE, 100);
        System.out.println("100일 후 = " + cal.getTime());
        cal.add(cal.DAY_OF_MONTH, 1);
        System.out.println("1일 후 = " + cal.getTime());
        cal.set(cal.DATE, 10);
        System.out.println("셋팅 후 = " + cal.getTime());
    }
}