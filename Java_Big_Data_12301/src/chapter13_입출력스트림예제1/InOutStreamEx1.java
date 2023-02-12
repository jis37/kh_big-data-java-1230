package chapter13_입출력스트림예제1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 입출력 스트림 : 컴퓨터 내부와 외부 장치 간에 데이터를 주고 받는 것을 의미하며, 입출력 데이터를 공통적인 방법으로 처리하기 위한 스트림을 제공합니다.(추상화 개념 적용)
// 바이트 스트림 : 바이트 단위로 데이터를 전송하는 것, 성능이 우수하고, 파일로 저장 시 결과 확인 불가
// 바이트 스트림의 최상위 추상 클래스는 OutputStream입니다.
public class InOutStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.bin");
        byte[] array = {10,20,30,40,50};
//        os.write(array); // 문자 배열을 write 하기 array[10] -> 이 경우 주소가 넘어가는 것이 아니라 값이 넘어감
        os.write(array, 1,3); // 배열을 1부터 3개를 출력

        os.flush(); // write() 이후에는 반드시 버퍼를 비우는 동작이 필요(flush).
        os.close(); // 자원 반납 및 스트림 닫기

/*
        byte a = 10;
        byte b = 20;
        byte c = 30;
        os.write(a);
        os.write(b);
        os.write(c);

        os.flush(); // write() 이후에는 반드시 버퍼를 비우는 동작이 필요(flush).
        os.close(); // 자원 반납 및 스트림 닫기
 */

    }
}
