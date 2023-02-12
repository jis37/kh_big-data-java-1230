package chapter10_쓰레드예제1;
// 멀티쓰레드 : 하나의 프로그램에서 여러가지 일을 동시에 수행하는 것
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread test = new TestThread();
        test.start(); // start를 부르면 실제로 run이 실행 됨.
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum += i;
            System.out.println("여기는 메인 쓰레드 입니다. : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}
// 쓰레드를 만드는 방법 : Thread class를 상속 받는 방법이 있음(좋은 방법은 아님 - 상속을 받았기 때문에 다른 상속을 받을 수 없음)
class TestThread extends Thread {
    @Override
    public void run() { // run 메소드가 필요함(동작을 위해/구현 여부 상관 없음)-인터페이스 상속은 무조건 구현
        int sum = 0;
        for(int i = 0 ; i <= 100; i++){
            sum += i ;
            System.out.println("여기는 테스트 쓰레드 입니다 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }
}