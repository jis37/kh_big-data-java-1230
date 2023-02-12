package chapter4_ContinueEx1;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0) continue; // 짝수를 빼고 홀수만 출력 함
            System.out.println(i);
        }
    }
}
