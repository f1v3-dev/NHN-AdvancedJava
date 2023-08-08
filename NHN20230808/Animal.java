package NHN20230808;

public interface Animal {

    default String type() {
        return this.getClass().getSimpleName();
    }

    default boolean flyable(){
        return false;
    }

    default boolean swimable(){
        return false;
    }
}

/**
 * 연산의 집합이고, implementation에 관련된 것이 없어 
 * interface로 구현을 하였음
 * flyable 날 수 있음과 swimable 수영할 수 있음 두가지 함수는
 * default method를 꼭 써야하는지에 대해 궁금하다.
 * 굳이? 박쥐, 참새, 펭귄에서 Override 하는 방식이 존재
 * 둘 중에 어떤 방식이 더 나은 것인가?
 * 
 * inheritance와 method overriding에 대한 질문의 답에 대해 생각중
 */