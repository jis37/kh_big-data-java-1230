package chapter10_쓰레드예제3;

import java.awt.*;

import static java.lang.Thread.sleep;

// sleep() : 실행 중인 쓰레드를 일정 시간 동안 대기 상태로 만듦(반복 수행에 대한 시간을 늦출 때 사용하거나, 인터럽트 예외 처리를 위해서 사용)
public class ThreadEx3_sleep {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0;i<10;i++){
            toolkit.beep();
            try {
                sleep(3000);
            }catch(InterruptedException e){
            }
        }
    }
}
