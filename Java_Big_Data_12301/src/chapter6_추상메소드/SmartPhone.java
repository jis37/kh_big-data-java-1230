package chapter6_추상메소드;

public class SmartPhone extends Phone{
    SmartPhone(String name) { // 부모의 생성자에 매개 변수가 있기때문에 무조건 먼저 불러 주어야 한다.
        super(name);
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 구현 합니다.");
    }
    public void internet(){
        System.out.println("인터넷 기능을 만듭니다.");
    }
}
