package 버블정렬;
// 1ㅊ타원 배열을 이용한 버블 정렬 : 가장 비효율적이지만 구현하기 쉬운 정렬 방식
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,4,3,100,5,8,7,6,2,122};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){ // 처음 i가 0일때
            for(int j = i; j < arr.length; j++){
                // j는 i값일때 시작 후 i가 j보다 클때 값을 비교
                // 비교 값이 작은 것을 tmp로 대입 전i 값을 j로 대입 tmp를 i로 대입
                if(arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
