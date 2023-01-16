package 예제상속이있는TV;
// 상속 관계가 있는 TV
// Overriding 오버라이딩 적용
public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(120);
        lgTV.setChannel(1901,true);
        lgTV.viewTV();
    }
}
