package chapter12_2_스트림예제2;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("남해이", 89));
        list.add(new Student("최지열", 99));
        list.add(new Student("남행선", 78));

//        list.stream().forEach(s->{ // 직렬처리 스트림
        list.parallelStream().forEach(s->{ // 병렬처리 스트림
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score); //Fork 라 붙은 것은 복재를 함 시스템 코어에 따라 달라짐 Thread.currentThread().getName()
        });
        double avg = list.stream().mapToInt(s->s.getScore()) // (Student::getScore) 와 같은 의미
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}