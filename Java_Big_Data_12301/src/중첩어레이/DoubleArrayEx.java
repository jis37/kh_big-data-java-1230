package 중첩어레이;
// 2차원 배열에 대해
// 10 20 30
// 40 50 60

public class DoubleArrayEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;
        for(int i = 0; i < arr.length; i++){ // 행의 갯수를 알 수 있음(arr이가 가리키는 값은 2행 3열 중 2행)
            for(int j = 0; j < arr[i].length; j++){ // [i] 번째 행의 length를 가리킴
                arr[i][j] = k;
                k += 10;
            }
        }
        for(int[] row : arr){ //행에 대한 향상된 for문
            for(int e : row) System.out.print(e + " "); // 향상된 for 문에서도 for 문을 2번 사용 행과 열
            System.out.println();
        }
        for(int i = 0; i < arr.length; i++){ // 행의 갯수를 알 수 있음(arr이가 가리키는 값은 2행 3열 중 2행)
            for(int j = 0; j < arr[i].length; j++){ // [i] 번째 행의 length를 가리킴
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
