package chapter9_3_HashMap기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 HashCode()를 통해서 수행 함
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서를 유지 하지 않음
// 경우에 따라서 hashcode()와 equals() 메소드를 오버라이드 해서 사용해야 함.
// HashMap은 성능이 우수하고 멀티 쓰레드 환경을 지원하지 않음(즉, 동기화 기능 없음)
// HashTable은 HashMap과 내부 구조가 동일하며, 멀티 쓰레드 지원
// Properties : HashTable을 상속 받아서 기능을 제약하여 사용(키와 값이 모두 문자열로만 구성), 정보를 파일에 저장하거나 읽기 위한 용도
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 96); // 키가 같기 때문에 값이 나중의 값으로 대체 됨
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기
        System.out.println(map.get("동그라미"));
        // map을 순회하는 방법 : 향상된 for 문 사용
        for(String key : map.keySet()) { // 모든 키를 Set 객체에 담아서 리턴
            System.out.println(key + " : " + map.get(key));
        }
        // 반복자로 순회하는 방법(iterator)
        Set<String> keySet = map.keySet(); // Set 자체는 중복 값을 허용하지 않음
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){  //  키가 존재하는지 확인
            String key = iterator.next(); // 키를 가져 옴
            System.out.println(key+ " : " + map.get(key));
        }
        // 객체 학제
        map.remove("최수연"); // 키로 map.entry 를 제거
        System.out.println("총 Entry 수 : " + map.size());

        // 값을 수정 하는 메소드
        map.replace("이준호", 92);

        // Map.Entry 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());




/*
        // 객체 추가 : put(키, 값)
        map.put("Americano", 2500);
        map.put("Latte", 4500);
        // 객체 찾기 : get(키) 반환 값으로 값이 넘어 옴
        System.out.println("값 읽기 : " + map.get("Latte"));
        System.out.println("값 읽기 : " + map.get("Latte2")); // 없는 값은 null이 출력 됨
        // 객체 삭제 : remove(키) 삭제가 정상적으로 진행되면 값이 넘어 옴
        System.out.println("값 제거 : " + map.remove("Latte"));
        System.out.println("값 제거 : " + map.remove("Latte2"));

 */

    }
}
