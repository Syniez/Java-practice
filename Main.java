package test;

class super_sample {
    private String name;
    public super_sample() {
        System.out.println("슈퍼 클래스 생성자 입니다.");
    }

    public super_sample(String name) {
        this.name = name;
        System.out.println("스트링을 사용하는 슈퍼 클래스 생성자 입니다.");
        System.out.println(name + "님 안녕하세요");
    }

    public void roan_info(String place_in) {
        if (place_in == "서울")
            System.out.println(name+"님 서울사나요?");
    }
}


class child_sample extends super_sample {
    public child_sample() {
        System.out.println("자식 클래스 생성자 입니다.");
    }

    public child_sample(String name) {
        super(name);
        System.out.println("스트링을 사용하는 자식 클래스 생성자 입니다.");
    }
}


public class Main {
    public static void main(String[] args) {
        child_sample child = new child_sample();
        child_sample name_child = new child_sample("Syniez");
        child.roan_info("서울");
        name_child.roan_info("서울");
    }
}
