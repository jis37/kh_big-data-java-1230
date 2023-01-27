package chapter7_4_열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("정인식", DevType.EMBEDDED, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
        System.out.println();
        Developer developer1 = new Developer("곰돌이", DevType.MOBILE, Career.JUNIOR, Gender.MALE);
        developer.devInfo();

    }
}
