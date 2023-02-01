package 예제_cp9_클래스정렬연습문제;

import java.util.Comparator;

public class ScoreSort implements Comparator<StudentInfo> {

    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.score == o2.score){
            return o1.id.compareTo(o2.id); // 성적이 같은 경우 학번순 정렬
        }
        return o2.score - o1.score; // 성적이 높은 순으로 내림 차순(큰 것에서 작은 것 순으로)
    }
}
