package chapter10_쓰레드예제4;
// join() : 다른 쓰레드가 종료 될 때 까지 대기 후 실행해야 하는 경우 사용
public class ThreadEx4_join {
    public static void main(String[] args) {
       SumTh sumTh = new SumTh();
       sumTh.start();
       try {
           sumTh.join(100); // sumTh()가 종료 될 때까지 main이 대기하고 있음 // (500) 괄호 안에 시간 만큼 기다린다는 의미
       } catch(InterruptedException e){
       }
       System.out.println("합 : " + sumTh.getSum());
    }
}

class SumTh extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            sum += 1;
            try {
                sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}