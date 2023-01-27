package 예제_cp7_과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;

// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전 (알파벳 순서) 순 정렬하기
// String length() : 양수, 음수
// String compareTo() : 같은 경우 0, 양수가 나오면 정렬 조건, 음수가 나오면 현상태 유지
// Arrays.sort(배열이름, new Comparator<String>(){ compare() 메소드 구현}
public class FruitTest {
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Grape", "Banana", "Melon", "Watermelon", "Kiwi", "Cherry", "Mango", "Orange", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // 정렬 조건을 넣어 줌 // 첫번째가 두번째 보다 길이가 길면 정렬 조건 return 1
                else {
                    if(o1.length() == o2.length()){
                        return o1.compareTo(o2); // 두번째가 사전 순서 상 앞에 있으면 양수
                    }
                }
                return -1; // 첫번째가 두번째 보다 짧으면 그대로 유지(return -1)-> 음수
            }
        });
        System.out.println(Arrays.toString(fruit));
/*
        String test = "abcd";

        System.out.println(test.compareTo("ab")); // 양수 -> 뒤가 짧으면
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcde")); // 음수 -> 뒤가 길면

 */
    }
}
