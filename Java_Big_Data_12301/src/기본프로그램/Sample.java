package 기본프로그램; // 접근제한자(캠슐화)와 연관성이 있음
// 접근제한자 : public, protected, default, private
/*
여기는 범위 주석입니다.
주석이란? 사람은 이해하고, 컴파일러는 무시하는 영역
 */
// 범위 지정 후 cmd + /는 범위 지정된 부분 전체 주석

public class Sample { // 클래스 이름을 지정,파일 이름과 클래스 이름은 같아야 한다(public class는 하나만 올 수 있음)
    // 클래스 이름은 관례상 첫 글자를 대문자로 사용
    // main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출 함.
    public static void main(String[] args) { //class 내에 메소드가 있어야함(ex. main) 참조형은 첫글자를 대문자로 사용함
        // void 메소드 앞에 붙이면 실행 이후의 반환 타입 중 하나이다.
        // {} : 중괄호 - 클래스, 메소드 등의 범위를 결정
        // () : 소괄호 - 메소드의 매개변수를 넣는 곳
        // [] : 대괄호 - 배열 등을 정의 할 때 사용 됨
        System.out.println("Hello, Java !!!!");
    }
}
class test{
    public  void test(){
        System.out.println("test"); //클래스가 하나더 있을 수 있지만 public class는 올 수 없음
    }
}
