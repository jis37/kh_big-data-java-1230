package 예제cp6_인터페이스코코아톡;
// 메신저 기능에 대한 클래스
public class Cocoatok {
    private String to; // 상대방 이름
    private String msg;  // 전달할 메시지
    public Cocoatok(String name){ // 생성자 호출시 이름 입력
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na){
        na.send(msg);
    }
}
