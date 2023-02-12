package 예제_게임만들기;
//
public interface GameAction {
    double pAttack(); // 물리 공격력 // 앞에 public abstract가 붙어 있음
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극기의 공격력
    boolean setDamage(double damage); // 받는 피해량
}
