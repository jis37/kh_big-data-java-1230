package chapter13_입출력스트림예제4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
// Reader : 문자 스트림의 최상위 추상 클래스이다.
public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readData;
        while(true) {
            readData = reader.read(); // 한개의 문자(2바이트)를 읽어 4byte int 타입으로 반환
            if(readData == -1) break; // -1 읽을게 없으면 break
            System.out.print((char)readData);
        }
        reader.close();
    }
}
