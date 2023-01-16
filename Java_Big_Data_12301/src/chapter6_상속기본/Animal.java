package chapter6_상속기본;

public class Animal {
    String name;
    void setName(String name){ // setter를 이용한 초기화
        this.name = name;
    }
}
// 상속을 받기 위해서는 extends 사용
// Animal class로 부터 상속을 받아 Dog class를 생성
// Dog class에서 아무런 기능을 구현하지 않아도 자동으로 부모의 필드와 메소드가 포함되어 있음
class Dog extends Animal{
    void sleep(){
        System.out.println(name +" 잠을 잡니다.");
    }
}
class HouseDog extends Dog {
    @Override // 어노테이션 : 부가 정보를 제공하는 문법(오버라이드가 있는지 없는지 체크하는 문법)
    void sleep() {
        System.out.println(name +" 집에서 잠을 잡니다.");
    }
    // 오버로딩 관계가 성립
    void sleep(int time){
        System.out.println(name + "가 " + time + "시간 동안 " + "집에서 잠을 잡니다.");
    }
}

