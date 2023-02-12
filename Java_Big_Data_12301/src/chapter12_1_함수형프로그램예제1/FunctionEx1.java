package chapter12_1_함수형프로그램예제1;
// 함수형프로그램 : 자바 8에서 도입, 수학공식과 유사, 불변성의 원칙, 조건문/반복문 사용 금지 등의 특징을 가짐
// 람다(Lambda) : 화살표 표현식으로 사용 됩니다. 생략 가능한 모든 것을 생략하는 것을 기본 원칙으로 합니다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 함수형 인터페이스가 필요합니다.
@FunctionalInterface // 함수형 프로그램을 만들기 위해 어노테이션을 걸었다는 선언
interface  Calculator {
    int sum(int a, int b);
}
@FunctionalInterface
interface MyFuncInterface {
    void method(int x); // 매개변수가 있는 타입
}
@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y); // 반환 타입이 있는 형태
}

public class FunctionEx1 {
    public static void main(String[] args) {
//        Calculator mc = (a, b) -> a + b;
//        int rst = mc.sum(3,4);
//        System.out.println(rst);

//        MyFuncInterface fi = x -> {
//            int result = x * 5;
//            System.out.println(result);
//        }; // 구현부에서 세미콜론으로 끝을 내야함
//        fi.method(2); // 호출부로 호출해서 출력함

        MyFuncInterface2 fi = (x, y) -> x < y ? x : y; // 구현부
        System.out.println(fi.min(3, 4));
    }
}
