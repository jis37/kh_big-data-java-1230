package chapter12_1_함수형프로그램예제2;
// 메소드 참조 : 메소드를 참조해서 매개 변수의 정보 및 반환 타입을 알아내어, 불 필요한 매개 변수를 제거 함

import java.util.function.IntBinaryOperator;

class Calculator{
    public static int staticMethod(int x, int y){
        return x + y;
    }
    public int instanceMethod(int x, int y){
        return x + y;
    }
}

public class FunctionEx2 {
    public static void main(String[] args) {
        IntBinaryOperator operator; // 두개의 int 연산하는 인터페이스
        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1 : " + operator.applyAsInt(1,2)); // 두개의 연산 결과값을 출력 // 두개의 int 연산
        // 메소드 참조 방식
        operator = Calculator::staticMethod; // 소속 지정자 (c++에서) 클래스 소속::메소드
        System.out.println("결과 2 : " + operator.applyAsInt(3,4));
        // 인스턴스 메소드 참조
        Calculator obj = new Calculator(); // 인스턴스 참조는 객체를 만들어야 함
        operator = (x,y) -> obj.instanceMethod(x,y);
        System.out.println("결과 3 : " + operator.applyAsInt(5,6));
        // 메소드 참조 방식
        operator = obj::instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(7,8));
    }
}
