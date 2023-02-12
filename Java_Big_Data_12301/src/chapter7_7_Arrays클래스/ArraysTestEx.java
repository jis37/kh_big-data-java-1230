package chapter7_7_Arrays클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있습니다.
// binarySearch() : 이분 검색 알고리즘 제공(정렬이 되어 있어야 함, 정렬 중에 중간 값이 찾는 값보다 높은지 낮은지 재검색하는 방법)
// sort() : 기본적인 오름차순, 매개 변수를 이용해 내림차순, 오버라이딩 통한 직접 구현
// toString() : 배열의 요소를 문자열로 출력
// asList() : 일반 배열을 ArrayList로 변환
// 배열의 개수 입력, 찾을 수 입력
public class ArraysTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 : ");
        int num = sc.nextInt();
        Integer[] arr = new Integer[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * num) + 1; //배열의 갯수 범위 내의 값으로 난수 발생
        }
        Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;   // 내림 차순 정렬
                else return -1;
            }
        });
        for(int e : arr) System.out.print(e + " ");
        System.out.println();
        int rst = Arrays.binarySearch(arr,key); // 배열 이름과 찾을 값을 매개변수로 전달 함
        // 결과 값으로 해당 값이 있는 배열의 인덱스가 반환 됨, 찾는 값이 없으면 음수가 반환 됨
        if(rst >= 0) System.out.println("찾은 값의 인덱스 : " + rst);
        else System.out.println("찾는 값이 없습니다.");
    }
}
/*
        int[] arr = {5,3,4,1,2,345,777,657,234};
        // (arr) -> 오름차순 정렬
        Arrays.sort(arr, new Comparator<Integer>(){ // 배열을 Integer 타입으로 생성해야 함
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return 1;
                return 0;
            }
        }
        for(int e : arr) System.out.print(e + " ");
 */
