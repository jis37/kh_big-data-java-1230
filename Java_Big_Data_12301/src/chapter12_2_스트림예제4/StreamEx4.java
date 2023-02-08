package chapter12_2_스트림예제4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 파일로 부터 스트림 얻기
public class StreamEx4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/chapter12_2_스트림예제4/chicken.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();


    }
}
