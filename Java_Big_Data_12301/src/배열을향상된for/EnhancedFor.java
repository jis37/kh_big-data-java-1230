package 배열을향상된for;
// 향상된 for 문은 배열의 요소를 처음부터 끝까지 자동 순회
// #2 배열의 내부 값을 변경 할 수 없음
public class EnhancedFor {
    public static void main(String[] args) {

        int[] score = {80, 99, 70};
        int sum = 0;
        for(int e : score){
            e += 10;
            sum += e;
        } // e의 +10 값이 for 문 내에서만 바뀌고 위 배열 { } 안에 값은 바뀌지 않음 #2
/*
        for(int i = 0; i < score.length; i++) {
            score[i] += 10;
        }

        sum = 0;
        for(int i = 0; i < score.length; i++) {
            score[i] += 10;
        }
 */
//        for(int e : score){ // 요소(e)가 score 값을 순회하며 실행문
//            sum += e;
//        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double) sum / score.length);
    }
}
