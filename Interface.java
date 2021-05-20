package com.company;

interface Intogether {
    public void info_cost(int type_info);
}

class mng_banquet {
    int inwon;
    protected int cost;

    public void info_prn() {
        System.out.println("가격정보 : " + inwon*cost);
    }
}

class mng_birth extends mng_banquet implements Intogether {
    public void info_cost(int type_info) {
        if (type_info == 1)
            cost = 9000;
        else
            cost = 15000;
    }
}

public class Main {
    public static void main(String[] args) {
        mng_birth pt = new mng_birth();
        pt.inwon = 5;
        pt.info_cost(2);
        pt.info_prn();
    }
}