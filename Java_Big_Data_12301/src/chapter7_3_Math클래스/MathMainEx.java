package chapter7_3_Math클래스;
// Math 클래스의 모든 메소드는 클래스 메소드 이므로 객체를 생성하지 않고 바로 사용 함.
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환
// 7자리의 로또 번호 생성하기
// 7개의 배열을 만들고 첫번째 부터 여섯번째는 0 ~ 50 사이의 임의의 수 생성 후 대입
// 마지막 7번째는 50~100사이의 임의의 수를 만들어서 대입하고, 한번에 출력, 단 중복은 허용
public class MathMainEx {
    public static void main(String[] args) {
//        int[] lotto = new int[7];
//        for(int i = 0; i < 6; i++) {
//            lotto[i] = (int) (Math.random() * 51); // 0 부터 50까지 = 51개의 수
//        }
//            lotto[6] = (int)(Math.random()*51)+50;
//        for(int e : lotto) System.out.print(e + " ");
//  ==========================================================================
//      abs() 메소드 : 절대값 구하기, 양수면 양수, 음수면 양수
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(-3.14));
//  ==========================================================================
        // floor() : 소수점 이하를 무조건 날림
        // ceil() : 소수점 이하가 있으면 무조건 올림
        // round() : 반올림 (소수점 첫째자리에서 반올림)
        // pow() : 지수의 값 구하기
        System.out.println(Math.floor(10.9999));
        System.out.println(Math.ceil(10.9999));
        System.out.println(Math.round(10.5));
        System.out.println(Math.round(10.49999));
//  ==========================================================================
        System.out.println(Math.max(11, 9.999));
        System.out.println(Math.min(11,9.99));
        System.out.println(Math.pow(2,5)); // 2 * 2 * 2 * 2 * 2
    }
}
//  ==========================================================================
//        // 0부터 99사이의 임의의 수 생성 하기
//        for (int i = 0; i < 100; i++) {
//            System.out.println((int) (Math.random() * 100));
//        }
//        // 3 ~ 8 사이의 임의의 수 생성 하기
//        System.out.println((int)(Math.random()*6)+3);

