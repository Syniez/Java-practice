package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "자바";
        str1 = str1 + str2;
        System.out.println("문자열 연결결과 ==> " + str1 + "\n");

        // ----------------------------------------------------

        String str3 = "good python program";
        String str4 = str3.substring(5);
        System.out.println("5번째 이후 문자열 : " + str4);
        String str5 = str3.replace("python", "JAVA");
        System.out.println("변경 후 문자열 : " + str5);

        int i = str5.indexOf('J');
        if (i == -1)
            System.out.println("해당 문자가 존재하지 않습니다.");
        else
            System.out.println("해당 문자는 " + i + "번째 위치하고 있습니다." + "\n");

        // --------------------------------------------------

        String str6 = "oracle";
        String str7 = "java";
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        sb.append(str6);
        sb.append(str7);
        sb2.append(str6);
        sb2.append(str7);
        String joinresult = sb.toString();
        String joinresult2 = sb2.toString();

        System.out.println(joinresult);
        System.out.println(joinresult2 + "\n");

        // ---------------------------------------------------------

        StringJoiner sj = new StringJoiner("/", "(", ")");
        StringJoiner sj2 = new StringJoiner("/", "(", ")").add("사과").add("복숭아").add("딸기");
        sj.add("사과");
        sj.add("복숭아");
        sj.add("딸기");
        String result = sj.toString();
        String result2 = new StringJoiner("-").add("사과").add("복숭아").add("딸기").toString();

        System.out.println("결과 ==> " + result);
        System.out.println("결과 ==> " + sj2);
        System.out.println("결과 ==> " + result2);

    }
}