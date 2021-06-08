package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int y, m, d, h;
        Calendar cal = Calendar.getInstance();
        y = cal.get(cal.YEAR);
        m = cal.get(cal.MONTH);
        d = cal.get(cal.DATE);
        h = cal.get(cal.HOUR_OF_DAY);

        System.out.println("현재년도 : " + y + "년" + m + "월" + d + "일" + h + "시" + "\n");

        // ----------------------------------------------------------------------------

        Calendar cal2 = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("MM-dd-yy");

        System.out.println("날짜결과1 : " + df.format(cal.getTime()));
        System.out.println("날짜결과2 : " + df2.format(cal.getTime()) + "\n");

        // -----------------------------------------------------------------------------


        try {
            System.out.println("당신의 입사날짜를 입력하세요");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();

            SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
            Date da = df3.parse(a);
            System.out.println("당신의 입사일자 : " + da);

            String result;
            SimpleDateFormat dfresult = new SimpleDateFormat("yy-MM-dd");
            result = dfresult.format(da);
            System.out.println("당신의 입사일자 : " + result);
        }
        catch(java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }
}