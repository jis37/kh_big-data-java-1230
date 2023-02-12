package chapter6_슈퍼메소드;
// super() : 부모 클래스의 생성자를 호출하는 메소드입니다.(자식의 생성자 내에서 호출)
// 자식의 생성자에서 부모의 생성자를 호출 할 때는 반드시 부모의 생성자를 먼저 호출하고 다른 초기화를 진행해야 함
// 생성자를 따로 만들지 않으면 기본 생성자가 호출되는 것처럼 부모의 생성자도 생성자를 별도로 만들어 주지 않으면
// 기본적으로 부모의 생성자가 자동 호출 됨.
public class SuperMethod {
    public static void main(String[] args) {
        System.out.println("main method 호출");
        Child child = new Child();
        child.display();
    }
}
class Parent{
    int a;
    Parent(){
        System.out.println("부모의 기본 생성자 호출");
        a = 10;
    }
    Parent(int n){
        System.out.println("부모의 생성자 호출");
        a = n;
    }
}
class Child extends Parent {
    int b;
    Child(){
        super(100); // 부모 생성자는 무조건 처음으로 호출이 되어야 함
        System.out.println("자식의 생성자 호출");
        b = 20;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}