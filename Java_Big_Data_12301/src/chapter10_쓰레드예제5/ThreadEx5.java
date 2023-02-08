package chapter10_쓰레드예제5;
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
// wait() : 현재의 쓰레드를 일시 정시 상태로 전환
// notify() : 대기 상태에 있는 쓰레드를 실행 대기 상태로 전환
// notifyAll() : 일시 정지된 모든 쓰레드를 실행 대기로 전환
public class ThreadEx5 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA thA = new ThreadA(sharedObject);
        ThreadB thB = new ThreadB(sharedObject);
        thA.start();
        thB.start();
    }
}
