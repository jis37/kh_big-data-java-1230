package chapter9_7_큐예제1;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO(First In First Out)구조, LinkedList 구조를 사용하고 있으며, LinkedList 기능 중 큐 관련 기능으로 제한 됨
// add(e) : 맨 뒤에 요소를 삽입(중간 삽입 안됨) - 예외 발생(예외 처리 안되면 프로그램이 실행 안됨)
// offer(e) : 맨 뒤에 요소를 삽입 - true/false 삽입이 안되면 false 반환(프로그램이 되던 안되던 실행)
// remove() : 맨 앞의 요소를 제거 - 예외 발생
// poll() : 맨 앞의 요소 제거 - 비어 있으면 null 반환
// element() : 맨 앞의 요소를 읽어 옴 - 예외 발생, 제거하지 않음
// peek() : 맨 앞의 요소를 읽어 옴 - 큐가 비어 있으면 null
public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>();
        msgQ.offer(new Message("Mail", "카즈하"));
        msgQ.add(new Message("SMS","안유진"));
        msgQ.offer(new Message("KaKao", "윈터"));
        while(!msgQ.isEmpty()) {
            Message msg = msgQ.poll(); // 큐에서 한 개의 메시지를 꺼냄(맨 앞)
            switch (msg.command){
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "KaKao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다.");
                    break;
            }

        }
    }
}

class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}