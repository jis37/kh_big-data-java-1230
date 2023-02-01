package chapter9_3_프로퍼티;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

// 키와 값(value)이 모두 String 타입으로 제한된 Map 컬렉션이며, HashTable 에서 상속 받았습니다.
// 주로 문자열로 이루어진 파일에서 정보를 읽을 때 사용 합니다.
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); // HashTable 에서 상속 받음
        // getResource -> 상대 경로로 찾아가는 게 유리함
        String path = PropertiesEx.class.getResource("../database.properties").getPath();  // ./ -> 내위치 ../ -> 상위 폴더 이동
        path = URLDecoder.decode(path, "utf-8"); // utf-8 -> 전세계 문자 사용 가능(한글 때문에 사용) // 한글이 포함되는 이를 해석 위한 코드
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
