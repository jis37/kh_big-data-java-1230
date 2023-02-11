package chapter13_입출력스트림예제3;
// 바이트 출력 스트림의 최상위 추상 클래스는 OutputStream 이다.
// 문자 출력 스트림의 최상위 추상 클래스는 Write 이다.(이름이 다르지만 같다고 봐야함)

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class InOutStreamEx3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt"); // 텍스트 파일을 만듦
//        char[] data = "일타스캔드 재밌음".toCharArray(); // 만든 파일에 문자를 배열 만들어서 입력을 할 수 있음
        String data = "재벌집 막내 아들은 재밌었는데 끝이 별로 였음";
//        for(int i = 0; i < data.length; i++){
//            writer.write(data[i]);
//        }
        writer.write(data);
        writer.flush(); // write() 이후에 버퍼를 비움
        writer.close(); // 스트림의 자원을 반납하고 닫음
    }
}
