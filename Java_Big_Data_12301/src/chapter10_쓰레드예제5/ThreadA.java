package chapter10_쓰레드예제5;

public class ThreadA extends Thread {
    private WorkObject workObject;
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            workObject.methodA();
        }
    }
}
