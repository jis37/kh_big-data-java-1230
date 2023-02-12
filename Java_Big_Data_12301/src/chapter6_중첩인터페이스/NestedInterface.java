package chapter6_중첩인터페이스;
// 중첩인터페이스 : 클래스 내부에 선언한 인터페이스를 말합니다.
// UI 프로그래밍에서 이벤트 처리를 위해 주로 사용합니다.
public class NestedInterface {
    public static void main(String[] args){
        Button button = new Button();
        button.setOnClickListener(new CallListener()); // 원래 이 버튼을 누르면 등록된 메소드 동작을 실행하게 됨
        button.touch(); // touch() 메소드 호출, 등록된 리스너의 onClick() 을 호출
        button.setOnClickListener(new MessageListener());
        button.touch();//
    }
}
