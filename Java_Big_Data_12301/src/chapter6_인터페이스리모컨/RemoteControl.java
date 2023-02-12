package chapter6_인터페이스리모컨;
// 인터페이스란?
// 모든 필드는 자동으로 상수(final static)으로 변환됩니다.
// 모든 메소드는 자동으로 추상 메소드가 됩니다.(public abstract가 자동 추가됨)
// 디폴트 메소드 : 예외적ㅇ로 구현부를 가질 수 있으며 상속 받은 클래스에서 재정의 가능합니다.
// 정적 메소드를 포함 할 수 있습니다.(정적 메소드는 객체와 상관 없고, 인터페이스 타입으로 사용됩니다.)
public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의 하지 않았지만 정적인 상수 이다.(인터페이스 생성 시 만들어지고, 객체는 안됨).
    int MIN_VOLUME = 0; // 자동으로 final ststaic
    void turnOn(); // 자동으로 public abstract가 붙음(왜냐하면 인터페이스는 기본적으로 모든 메소드가 추상메소드이다.)
    void turnOff();
    void setVolume(int volume);
    static void changeBattery(){ // 인터페이스 이름으로 접근해야 되고 상속과는 무관
        System.out.println("건전지를 교환합니다.");
    }
    void getInfo(); // public이 붙어있기 때문에 접근이 가능
    // 자바 버전 1.8 이후에 추가 되었으며 예외적으로 메소드의 구현부를 가질 수 있습니다.
    default void setMute(boolean mute) { // 메소드는 상속 받은 자식이 모두 구현해야 함(예외적인 사항으로 처리해야함-> default로 처리)
        if (mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음 처리 해제합니다.");
    }
}
