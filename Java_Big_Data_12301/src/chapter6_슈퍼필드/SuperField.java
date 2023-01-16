package chapter6_슈퍼필드;
// super : 자식 클래스가 부모 클래스로 부터 상송 받은 필드(멤버)를 참조하는 변수
public class SuperField {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
    }
}

class Parent{
    int x = 10;
}

class Child extends Parent{
    int x = 20;
    void childMethod(){
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.x);
    }
}