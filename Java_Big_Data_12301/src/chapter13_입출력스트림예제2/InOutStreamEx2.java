package chapter13_입출력스트림예제2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// InputStream : 바이트 기반의 입력 스트림의 최상위 클래스로 추상 클래스입니다.
public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while(true){
//            int data = is.read(); // 1 바이트 씩 읽기
//            if (data == -1) break; // 파일 입출력에서 디폴트는 -1 계속 읽다가 읽을 파일이 없으면 -1이 됨// 파일의 끝에 도달
//            System.out.print(data + " ");

            int readByteNum = is.read(buffer); // 매개 변수로 전달한 buffer에 값을 담음 // (buffer, 2, 3) 2
            if(readByteNum == -1) break;
            for(int i = 0; i < readByteNum; i++){
                System.out.print(buffer[i] + " ");
            }
        }
        is.close(); // 읽이 위해 열우 둔 스트림을 반드시 닫음
    }
}
