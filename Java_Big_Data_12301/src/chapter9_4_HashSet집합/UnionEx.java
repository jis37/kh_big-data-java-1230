package chapter9_4_HashSet집합;

import java.util.Arrays;
import java.util.HashSet;

// 합집합 : 두개의 값 중 한족에만 존재 결과를 반영(단, 동일 값이 양쪽에 존재할 경우 중복은 제거 됨)
// 교집합 : 두 개의 값이 모두 존재하는 값만 결과에 반영
// 차집합 : 앞의 값에서 뒤의 값을 제거한 나머지를 결과에 반영
public class UnionEx {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        s1.addAll(s2); // 합집합 : 1,2,3,4,5,6,7,8,9
//        s1.retainAll(s2); // 교집합 : 4,5,6
        s1.removeAll(s2); // 차집합 : 1,2,3,
        System.out.println(s1);

    }
}
