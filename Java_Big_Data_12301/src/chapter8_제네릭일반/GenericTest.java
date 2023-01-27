package chapter8_제네릭일반;

import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입 체크 / 자바 8 이전 대비 변경 사항
// 타입 변환 제거 / 자바 8 이전 대비 변경 사항
public class GenericTest {
    public static void main(String[] args) {
/*
        List list = new ArrayList(); // 자바 8 이전 스타일
        list.add("hello");
        String str = (String) list.get(0);

 */
// 제네릭 타입
        List<String> list = new ArrayList<>(); // List에서 사용할 데이터 타입을 미리 지정함으로 컴파일 시 타입 체크가 일어나도록 함
        list.add("hello");
        String str = list.get(0); // 0번째 값을 읽어 옴
        System.out.println(str);


    }
}
