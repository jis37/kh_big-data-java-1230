package 예제로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
// 리스트 타입 => HashSet 이용해 중복 제거로 변경하기
public class LottoArrayList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(); // 갯수 지정 필요 없음
        HashSet<Integer> list = new HashSet<>();
        int tmp; // 로또 번호를 임시로 저장하는 변수
        while(true){
            tmp = (int)((Math.random()*45)+1);
            list.add(tmp);
//            if(!list.contains(tmp)) list.add(tmp) ; // contains -> 내부에 포함되 있으면 참, (!)는 포함되어 있지 않으면
            if(list.size() == 6) break; // size 는 add가 한번 일어날 때마다 늘어 남
        }
        for (Integer e : list) System.out.print(e + " ");
    }
}
