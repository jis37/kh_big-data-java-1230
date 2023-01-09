package 배열의활용;
import java.util.Arrays;
// arrayCopy() : 배열 값을 복사할 때 사용(거의 사용하지 않음)
// copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사
public class ArrayApply {
    public static void main(String[] args) {
        int[] arr1 = {90,45,77,80,55}; // 원본 데이터
        /*
        int len = 10;
        int[] arr2 = new int[len];
        for(int i =0; i < arr1.length;i++){ // for문으로 값을 복사 할 수 있음
            arr2[i+3] = arr1[i];
        }
        System.arraycopy(arr1,0,arr2,4,arr1.length); // 배열을 복사 (복사될배열,복사시작위치,복사배열,복사배열위치,복사값)
         */
        int[] arr3 = Arrays.copyOf(arr1,10); // arr3에 arr1 값을 새로운 10개의 배열 값에 복사함
        System.out.println(Arrays.toString(arr3));
    }
}
