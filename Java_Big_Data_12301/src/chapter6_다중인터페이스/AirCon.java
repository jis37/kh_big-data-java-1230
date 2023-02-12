package chapter6_다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 이 컴파일러가 자동으로 추가 함
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 추상 메소드가 됨(abstract 자동 추가 됨)
    void airConOFF();
    void setAirConTemp(int tmp);
}
