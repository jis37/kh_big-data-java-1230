package 변수의생존범위;

public class ScopeData {
    public static void main(String[] args) {
        int value = 20; // 지역 변수
        if(value > 10){
            int m = value - 10;
        } // m 은 중괄호 이후 사라짐
        System.out.println(value); // m이 사라져서 출력이 안됨

/*
        int value = 20; // 지역 변수
        int m = 10; // m 생성 후 초기화를 해야 출력이 가능
        if(value > 10){
            m = m + (value - 10);
        }
        System.out.println(m); // 비추천 코드
*/
    }
}
