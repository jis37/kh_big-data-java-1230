package chapter6_객체지향TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV(); //기본 생성자 호출
        TV lgTV = new TV(true, 59,15); // 매개 변수가 있는 생성자 호출
        lgTV.getTV();

        samsungTv.setON(true);
        samsungTv.setChannel(1030);
        samsungTv.setVolume(30);
        samsungTv.getTV();

    }
}
