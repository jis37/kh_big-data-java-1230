package chapter12_2_스트림예제6;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 최종 연산 : 중개 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모해 결과를 출력
public class StreamEx6 {
    public static void main(String[] args) {
        // 요소의 출력
        Stream<String> stream = Stream.of("하나", "둘", "셋", "넷");
        stream.forEach(System.out::println); // (e -> System.out.print(e + "");
        // 요소의 소모 : 스트림의 요소를 소모하여 연산을 수행
        // reduce() : 첫 번째 요소와 두 번째 요소를 가지고 연산 수행 후, 그 결과와 세번째 요소를 가지고 다시 연산
        Stream<String> stream1 = Stream.of("하나", "둘", "셋", "넷");
        Stream<String> stream2 = Stream.of("하나", "둘", "셋", "넷");
        IntStream stream3 = IntStream.of(7,5,5,2,1,3,5,4,6);
        OptionalInt reduce = stream3.reduce((s1, s2) -> s1 + s2);
        System.out.println(reduce.getAsInt());
        Optional<String> rst1 = stream1.reduce((s1,s2) -> s1 + "+" + s2);
        rst1.ifPresent(System.out::println);

        // 요소의 검색 : findFirst(), findAny() : 해당 스트림에서 첫번째 요소를 반환
        IntStream stream4 = IntStream.of(4,2,7,3,5,1,6);
        IntStream stream5 = IntStream.of(4,2,7,3,5,1,6);
        OptionalInt rst2 = stream4.sorted().findFirst();
        System.out.println(rst2.getAsInt());
        OptionalInt rst3 = stream5.sorted().findAny(); // 병렬 처리 관련 부분이 포함되어 있어서 요소의 첫번째 값이 아닌 경우가 있음
        System.out.println(rst3.getAsInt());

        // 요소의 검사
        // anyMatch() : 해당 스트림의
    }
}
