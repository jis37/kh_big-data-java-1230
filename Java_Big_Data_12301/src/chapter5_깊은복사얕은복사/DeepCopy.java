package chapter5_깊은복사얕은복사;

import java.util.Arrays;

// 깊은 복사 : 할당된 메모리 공간에 실제 값이 복사 되는 것(기본 타입 모두 여기에 해당 함)
// 얕은 복사 : 참조 타입에 해당되며 실제 값이 복사 되는 것이 아니라 주소가 복사되는 것을 의미
public class DeepCopy {
    public static void main(String[] args) {
//        깊은 복사
/*
        int x = 100;
        int y;
        y = x; // y에 x값을 복사
        x = 200; // x 값을 바꿔도 y에 복사되지 않은(순서, y를 수정하지 않았음)
        System.out.println("y의 값 : " + y); //
*/

//      얕은 복사가 발생하는 경우
        int[] arr1 = new int[4];
        arr1[0] = 100;
        int[] arr2 = Arrays.copyOf(arr1,arr1.length); // 어디에, 얼마만큼 복사
//        int[] arr2 = arr1; // 얕은 복사가 일어 남
//        System.arraycopy(arr1,0,arr2,0,arr1.length); // 어디에,몇번째 부터.어디에,몇번째에,얼마만큼 복사
        arr1[0] = 300; // arr1에 값이 변경되면 주소가 복사된 것이라 arr2도 출력 값이 변경됨
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
