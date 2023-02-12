package chapter9_2_어레이리스트_예제1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// List 인터페이스 : 배열과 유사한 구조를 가지며 하위에 ArrayList, LinkedList Vector 클래스로 구성 됨
// 요소의 저장 순서가 유지, 중복 저장 허용, 동적 할당(크기 지정을 안해도 됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입-삭제는 느립(단, 맨뒤에 삽입/ 삭제는 빠름)-add를 많이 사용
// Vector : ArrayList와 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능 지원하기 때문에 안정적이나 ArrayList보다 느림
// LinkedList: 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴. 삽입/삭제가 매우 빠름, 검색은 느림
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> pitches1 = new ArrayList<>(); // 자신이 자신의 클래스에 있는 리스트를 가리킴
//        String[] data = {"138", "123","232", "231", "112"}; // 이미 만들어진 배열
        // List 인터페이스로 ArrayList 객체를 참조 함
//        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // asList()는 이미 만들어진 배열을 List에 추가
        List<String> pitches = new ArrayList<>(); // 변환이 필요할 경우 List로 사용하는게 유리할 수 있음(Vector나 linkedList로 변경할 경우)
        pitches.add("123"); // ArrayList 마지막 인덱스 이후 마지막에 값 추가(이때 사이즈가 증가 함)
        pitches.add("234");
        pitches.add("345");
        pitches.add(1,"155"); // 해당 인덱스에 값 추가 (성능에 영향을 미침) - 좋은 형태의 코딩은 아님
        pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(pitches);
//        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환 함
//        System.out.println(pitches.get(4)); // 없는 인덱스를 전달하면 예외가 발생함(예외 처리로 가능함)
//        System.out.println(pitches.size()); // ArrayList의 갯수 반환
//        System.out.println(pitches.contains("132")); // false 출력, 전달된 값이 ArrayList 내에 있는지 확인(있으면 true)
//        System.out.println(pitches.remove(0)); // 리스트에서 해당 항목을 삭제하고 삭제된 요소를 반환 함
//        System.out.println(pitches.remove("129")); // 리스트에서 해당 항목을 삭제하고 true/false로 반환

    }
}
