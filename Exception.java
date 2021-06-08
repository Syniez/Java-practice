package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate mydate = LocalDate.now();
        LocalDate yourdate = LocalDate.of(2023, 8, 5);

        Period p = mydate.until(yourdate);
        Period p2 = Period.between(mydate, yourdate);

        // until 메소드
        System.out.println("년도차이 : " + p.getYears() + "년");
        System.out.println("개월차이 : " + p.getMonths() + "월");
        System.out.println("일차이 : " + p.getDays() + "일\n");
        // between 메소드
        System.out.println("년도차이 : " + p.getYears() + "년");
        System.out.println("개월차이 : " + p.getMonths() + "월");
        System.out.println("일차이 : " + p.getDays() + "일\n");

        // ----------------------------------------------------------------------------------

        int y, m, d;
        System.out.println("년도 입력 : ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        System.out.println("월 입력 : ");
        Scanner sc2 = new Scanner(System.in);
        m = sc2.nextInt();

        System.out.println("일 입력 : ");
        Scanner sc3 = new Scanner(System.in);
        d = sc3.nextInt();

        LocalDate mydate2 = LocalDate.now();
        LocalDate yourdate2 = LocalDate.of(y, m, d);
        Period p3 = Period.between(mydate2, yourdate2);

        System.out.println("년도차이 : " + p3.getYears() + "년");
        System.out.println("개월차이 : " + p3.getMonths() + "월");
        System.out.println("일차이 : " + p3.getDays() + "일\n");

        // ------------------------------------------------------------------------------------

        try {
            String[] arr = {"해당화", "과꽃", "국화"};
            for (int i=0; i<=3; i++)
                System.out.println("꽃이름 : " + arr[i]);
        }

        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("꽃이름 출력 종료");
        }

        finally {
            System.out.println("프로그램 종료");
        }
    }
}