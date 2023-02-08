package chapter12_2_스트림예제5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
public class StreamEx5 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6); // of = 값을 만드는 메소드
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
        // 스트림에서 홀수 값만 골라냄
//        stream1.filter(n->n % 2 !=0).forEach(e->System.out.print(e + " "));
        System.out.println();
        // 스트림에서 중복 요소를 제거
//        stream2.distinct().forEach(e->System.out.print(e + " "));

        // 스트림 변환(map) : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성(글자의 길이 값 ex 4,3,4,10)
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCXERIPT");
        stream.map(e->e.length()).forEach(System.out::println);

        // flatMap : 아래 조건은 공백 기준으로 " " 나누어 출력함
        String[] arr = {"I study jard", "You Study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        // 스트림 제한
        // limit() : 해당 스트림의 첫 번째 요소부터 전달 된 갯수 만큼의 요소로만 이루어진 새로운 스트림 반환
        // skip() : 해당 스트림의 첫 번째 요소부터 전달 된 갯수 만큼의 요소를 제외하고 출력
        IntStream stream4 = IntStream.range(0,10); // 0 부터 10개의 수를 출력 // 10 미만까지 범위 지정
        IntStream stream5 = IntStream.range(0,10);
        IntStream stream6 = IntStream.range(0,10);
        stream4.limit(5).forEach(n->System.out.print(n + " ")); // 처음부터 5개
        System.out.println();
        stream5.skip(5).forEach(n->System.out.print(n + " "));
        System.out.println();
        stream6.skip(3).limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream7 = Stream.of("HTML", "CSS", "JAVA", "JAVASCXERIPT");
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCXERIPT");
        stream7.sorted().forEach(s->System.out.print(s + " "));
        System.out.println();
        stream8.sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));
    }
}
