package com.company;

import java.util.*;

class MakeGeneric<T> {      // T는 사용자가 데이터 타입을 지정하도록 함 (E도 있음)
    private T object;

    public void makeget() {
        System.out.println("전달받은 값 : " + this.object);
    }
    public void makeset(T object) {
        this.object = object;
    }
}

public class Main {
    public static void main(String[] args) {
        List sample1 = new ArrayList();
        sample1.add("채송화");
        sample1.add("목련");
        //sample1.add(1500);
        //String a = (String)sample1.get(2);
        System.out.println(sample1);

        // ------------------------------------------------------------------
        MakeGeneric <String> mygeneric = new MakeGeneric<>();
        mygeneric.makeset("홍길동");
        mygeneric.makeget();
    }
}
