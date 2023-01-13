package 상속기본;

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

}

