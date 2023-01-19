package chapter6_추상메소드;

public class AbstractMain2 {
    public static void main(String[] args) {
        Phone phone = new SmartPhone("Galaxy S22");
        phone.setPower(true);
        phone.call();
        phone.internet();
    }
}
