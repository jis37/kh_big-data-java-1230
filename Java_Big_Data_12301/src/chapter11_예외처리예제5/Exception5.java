package chapter11_예외처리예제5;

import java.io.FileWriter;
import java.io.IOException;

// finally : 프로그램 실행 중 예외가 발생 할 가능성이 있는 코드에 try 구문을 적용
// 이때 예외가 발생하면 catch 구문으로 진행 그렇지 않으면 아래 코드가 실행
// 이 경우 예외 여부에 상관없이 항상 실행 되어야 할 구문이 있다면 finally로 처리 할 수 있음.
public class Exception5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("text.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace(); // 프로그램이 죽었던 위치부터 내역을 알 수 있음
        } finally {
            if(f != null) {
                try{
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
/*
        int c;
        try{
            c = 4 / 0;
        }catch(ArithmeticException e){
            System.out.println("여기는 예외가 발생한 구문입니다.");
        } finally { // 예외 여부 상관 없이 실행되게 할 수도 있음
            shouldBeRun();
        }
    }
    static void shouldBeRun(){
        System.out.println("OK, Thanks.");

 */
    }
}
