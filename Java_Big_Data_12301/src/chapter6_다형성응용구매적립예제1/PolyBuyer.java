package chapter6_다형성응용구매적립예제1;
// 매개변수의 다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매를 하는 객체
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();

        buyer.buy(tv); // 메소드가 구매라는 행위를 하는 코드
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.viewInfo();
    }
}
