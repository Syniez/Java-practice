package com.company;

// abstract를 써서 추상 클래스임을 나타냄
abstract class banquet {
    protected String irum;
    protected int inwon;

    public void res_info(String irum, int inwon) {
        this.irum = irum;       // 전역, 지역 변수 구분위해 this 사용.
        this.inwon = inwon;
    }

    public abstract void tot_pay(int basic_cost, int use_cost); // 추상 메소드는 상위 클래스에서는 선언만!
}


class birthday_party extends banquet {
    public void tot_pay(int basic_cost, int use_cost) {     // 상속 받는 자식 클래스에서 메소드 정의 (자식클래스가 여러개면 각각에서 다 정의해줘야 함!)
        int pay_calc = 0;
        pay_calc = basic_cost * inwon + use_cost + 20000;
        System.out.println("비용" + pay_calc);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        birthday_party pt = new birthday_party();   // 상위 클래스가 추상 클래스라서 객체 생성 불가능.(자식 클래스에서 객체 생성)
        pt.res_info("Syniez", 8);
        pt.tot_pay(18000, 100000);
    }
}
