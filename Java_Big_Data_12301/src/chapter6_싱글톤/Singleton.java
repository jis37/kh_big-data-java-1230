package chapter6_싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton(){ // 생성자를 통해서 객체가 생성되지 않도록 접근 제하을 설정 // 생성자에 private를 붙일 때는 싱글톤을 만들때만 사용한다
        name = "test";
        id = 100;
    }
    // getSingleton() 메소드를 호출 시 반환 값으로 이미 만들어져 있는 싱글톤 객체의 참조 변수를 반환
    static Singleton getSingleton(){ // 싱글톤 객체를 미리 만들어 두고 private로 막아 둔 후 게터를 이용해서 싱글톤에 주소를 참조할 수 있음
        return singleton;
    }
}
